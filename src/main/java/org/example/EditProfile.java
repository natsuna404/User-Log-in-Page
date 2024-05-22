package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EditProfile extends JPanel {

    JLabel title = new JLabel("Edit Profile Page");
    JLabel changeUsername = new JLabel("Change Username: ");
    JTextField tf1 = new JTextField();
    JLabel confirmUsername = new JLabel("Confirm Username: ");
    JTextField tf2 = new JTextField();
    JLabel changePassword = new JLabel("Change Password: ");
    JTextField tf3 = new JTextField();
    JLabel confirmPassword = new JLabel("Confirm Password: ");
    JTextField tf4 = new JTextField();
    JButton saveChanges = new JButton("Save Changes");
    JButton cancel = new JButton("Cancel");

    public EditProfile(){
        setBounds(0,0,600,400);
        setVisible(true);
        setLayout(null);

        title.setBounds(200,20,200,25);
        changeUsername.setBounds(50, -125,600,400);
        tf1.setBounds(200,62,200,25);
        confirmUsername.setBounds(50,75,150,100);
        tf2.setBounds(200,112,200,25);
        changePassword.setBounds(50,125,150,100);
        tf3.setBounds(200,162,200,25);
        confirmPassword.setBounds(50,175,150,100);
        tf4.setBounds(200,212,200,25);

        saveChanges.setBounds(50,300,120,25);
        cancel.setBounds(200,300,120,25);

        add(title);
        add(changeUsername);
        add(confirmUsername);
        add(changePassword);
        add(confirmPassword);
        add(tf1);
        add(tf2);
        add(tf3);
        add(tf4);
        add(saveChanges);
        add(cancel);

        saveChanges.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf1.getText().equals(tf2.getText()) && tf3.getText().equals(tf4.getText())){
                    ProfileManager.changeProfile(tf2.getText(), tf4.getText());
                    Main.ChangeScreen(Screen.Welcome);
                    
                }
            }
        });
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ChangeScreen(Screen.Welcome);
            }
        });


    }

}
