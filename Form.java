import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Form::createForm);
    }

    private static void createForm() {
        JFrame frame = new JFrame("My Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel nameLabel = new JLabel("Name: ");
        JTextField fieldName = new JTextField(20);
        JLabel emailLabel = new JLabel("Email: ");
        JTextField fieldEmail = new JTextField(20); // Fixed typo here

        JLabel genderLabel = new JLabel("Gender: ");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JCheckBox subscribe = new JCheckBox("Subscribe");
        JButton submitButton = new JButton("Submit"); // Fixed name

        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(nameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(fieldName, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(emailLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(fieldEmail, gbc); // Fixed position

        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(genderLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        JPanel genderPanel = new JPanel();
        genderPanel.add(male);
        genderPanel.add(female);
        frame.add(genderPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        frame.add(subscribe, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        frame.add(submitButton, gbc);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = fieldName.getText(); // Use fieldName instead of name
                String email = fieldEmail.getText(); // Use fieldEmail instead of email
                String gender = male.isSelected() ? "Male" : female.isSelected() ? "Female" : "Not Specified"; // Corrected method names
                boolean isSubscribed = subscribe.isSelected();

                JOptionPane.showMessageDialog(frame, String.format(
                    "Name: %s\nEmail: %s\nGender: %s\nSubscribed: %b",
                    name, email, gender, isSubscribed
                ));
            }
        });

        frame.setVisible(true);
    }
}

