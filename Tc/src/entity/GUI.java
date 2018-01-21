package entity;


import javax.swing.*;

import translaterr.JSONException_Exception;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;

public class GUI extends JFrame {
	private JTextArea jta = null;   
	private JTextArea jta2 = null; 
    private JPanel jp = null;       
    private JScrollPane jsp =null;  
    private JScrollPane jsp2 =null;  
    private JComboBox jc = null;    
    private JTextField jtf = null;  
    private JButton jb = null; 
    private JButton jbclear=null;
	private  GUI(){
		jta = new JTextArea();  
		jta2 = new JTextArea();  
        jsp = new JScrollPane(jta); //文本域加入滚动条功能  
        jsp2=new JScrollPane(jta2);
        jp = new JPanel();  
        String chatter[] = {"Chinese","English","Japanese","Korean","French","Spanish","th","ara","ru","pt","de","it","el","nl","pl","bul","est","dan","fin","cs","rom","slo","swe","hu","cht","vie"};  
        jc = new JComboBox(chatter);  
        jtf = new JTextField(10);  
        jb = new JButton("translate");  
          jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String text=jta.getText().toString();
				String text2=text.replace("\n", " ");
				int x=jc.getSelectedIndex();
				String result;
				
					try {
						result = translatehelp.tl(text2, x);
						jta2.setText(result);
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (JSONException_Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
          jbclear=new JButton("clear");
          jbclear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jta.setText("");
				jta2.setText("");
			}
		});
        //添加组件  
        
        jp.add(jc);    
        jp.add(jb); 
        jp.add(jbclear);  
        this.setLayout(new GridLayout(3,0));
        this.add(jsp); //加入实现滚动功能文本域  
        this.add(jp);
        this.add(jsp2);
          
        this.setSize(900, 500);  
        this.setResizable(false);  
        this.setVisible(true);  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		GUI gui=new GUI();
	}
	
	

}
