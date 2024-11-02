import java.awt.*; 
import java.awt.event.*; 
import java.io.*; 
import javax.swing.*; 
public class ComplaintManagementSystem { 
public static void main(String[] args) { 
File account = new File("Account_Info.txt"); 
File complaine = new File("Complaine.txt"); 
try { 
account.createNewFile(); 
complaine.createNewFile(); 
} catch (IOException creatfileEX) { 
creatfileEX.printStackTrace(); 
} 
JFrame frame = new JFrame("Complaint Management System"); 
frame.setVisible(true); 
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
frame.setSize(800, 400); 
JPanel panel = new JPanel(); 
frame.add(panel); 
JButton adminLogin = new JButton("Admin Login"); 
panel.add(adminLogin); 
JButton customerLogin = new JButton("Customer Login"); 
panel.add(customerLogin); 
JButton createAccount = new JButton("Create Account"); 
panel.add(createAccount); 
JButton others = new JButton("Others"); 
panel.add(others); 
adminLogin.addActionListener(new ActionListener() { 
@Override 
public void actionPerformed(ActionEvent e) { 
JFrame adminLoginFrame = new JFrame("Admin"); 
adminLoginFrame.setVisible(true); 
adminLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
adminLoginFrame.setSize(800, 400); 
JPanel panel = new JPanel(); 
adminLoginFrame.add(panel); 
JLabel userNameLabel = new JLabel("Username:"); 
panel.add(userNameLabel); 
JTextField userNameTextField = new JTextField(20); 
panel.add(userNameTextField); 
JLabel passwordLabel = new JLabel("Password:"); 
panel.add(passwordLabel); 
JPasswordField passwordField = new JPasswordField(20); 
panel.add(passwordField); 
JButton loginButton = new JButton("Login"); 
panel.add(loginButton); 
JButton backButton = new JButton("Back"); 
panel.add(backButton); 
loginButton.addActionListener(new ActionListener() { 
@Override 
public void actionPerformed(ActionEvent e) { 
String username = userNameTextField.getText(); 
String password = new String(passwordField.getPassword()); 
if (username.equals("admin") && password.equals("admin")) { 
JFrame adminHomeFrame = new JFrame("Admin"); 
adminHomeFrame.setVisible(true); 
adminHomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
adminHomeFrame.setSize(800, 400); 
JPanel panel = new JPanel(); 
adminHomeFrame.add(panel); 
JButton viewComplaintListButton = new JButton("View Complaint List"); 
panel.add(viewComplaintListButton); 
viewComplaintListButton.addActionListener(new ActionListener() { 
@Override 
public void actionPerformed(ActionEvent e) { 
JFrame viewComplaintListFrame = new JFrame("View Complaint List"); 
viewComplaintListFrame.setVisible(true); 
viewComplaintListFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
viewComplaintListFrame.setSize(800, 400); 
JPanel panel = new JPanel(); 
viewComplaintListFrame.add(panel); 
//read Complaint List from the file 
BufferedReader br = null; 
try { 
br = new BufferedReader(new FileReader("Complaine.txt")); 
                                        String line; 
                                        while ((line = br.readLine()) != null) { 
                                            JLabel complaintLabel = new JLabel(line); 
                                            panel.add(complaintLabel); 
                                        } 
                                    } catch (IOException ioe) { 
                                        ioe.printStackTrace(); 
                                    } finally { 
                                        try { 
                                            if (br != null) { 
                                                br.close(); 
                                            } 
                                        } catch (IOException ioe) { 
                                            System.out.println("Error in closing the BufferedReader"); 
                                        } 
                                    } 
                                } 
                            }); 
                            JButton deleteComplaintButton = new JButton("Delete Complaint"); 
                            panel.add(deleteComplaintButton); 
                            JButton replyButton = new JButton("Reply"); 
                            panel.add(replyButton); 
                            JButton logoutButton = new JButton("Logout"); 
                            panel.add(logoutButton); 
                            deleteComplaintButton.addActionListener(new ActionListener() { 
                                @Override 
                                public void actionPerformed(ActionEvent e) { 
                                    JFrame deleteComplaintFrame = new JFrame("Delete Complaint"); 
                                    deleteComplaintFrame.setVisible(true); 
 
                                    
deleteComplaintFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 
                                    deleteComplaintFrame.setSize(800, 400); 
                                    JPanel panel = new JPanel(); 
                                    deleteComplaintFrame.add(panel); 
                                    JLabel failedLabel = new JLabel("This option is not available at this 
 
moment 
                                    , coming soon 
                                    ."); 
 
panel.add(failedLabel); 
                                    JButton backButton = new JButton("Back"); 
                                    panel.add(backButton); 
                                    backButton.addActionListener(new ActionListener() { 
                                        @Override 
                                        public void actionPerformed(ActionEvent e) { 
                                            adminHomeFrame.setVisible(false); 
                                            adminHomeFrame.setVisible(true); 
                                        } 
                                    }); 
                                } 
                            }); 
                            replyButton.addActionListener(new ActionListener() { 
                                @Override 
                                public void actionPerformed(ActionEvent e) { 
                                    JFrame replyFrame = new JFrame("Reply"); 
                                    replyFrame.setVisible(true); 
                                    replyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
                                    replyFrame.setSize(800, 400); 
                                    JPanel panel = new JPanel(); 
                                    replyFrame.add(panel); 
                                    JLabel failedLabel = new JLabel("This option is not available at this 
 
moment 
                                    , coming soon 
                                    ."); 
 
panel.add(failedLabel); 
                                    JButton backButton = new JButton("Back"); 
                                    panel.add(backButton); 
                                    backButton.addActionListener(new ActionListener() { 
                                        @Override 
                                        public void actionPerformed(ActionEvent e) { 
                                            adminHomeFrame.setVisible(false); 
 
                                            adminHomeFrame.setVisible(true); 
                                        } 
                                    }); 
                                } 
                            }); 
                            logoutButton.addActionListener(new ActionListener() { 
                                @Override 
                                public void actionPerformed(ActionEvent e) { 
                                    JFrame logoutConfirmFrame = new JFrame("Admin"); 
                                    logoutConfirmFrame.setVisible(true); 
 
                                    
logoutConfirmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 
                                    logoutConfirmFrame.setSize(800, 400); 
                                    JPanel panel = new JPanel(); 
                                    logoutConfirmFrame.add(panel); 
                                    JLabel confirmLabel = new JLabel("Are you sure you want to logout?"); 
                                    panel.add(confirmLabel); 
                                    JButton yesButton = new JButton("Yes"); 
                                    panel.add(yesButton); 
                                    JButton noButton = new JButton("No"); 
                                    panel.add(noButton); 
                                    JButton backButton = new JButton("Back"); 
                                    panel.add(backButton); 
                                    backButton.addActionListener(new ActionListener() { 
                                        @Override 
                                        public void actionPerformed(ActionEvent e) { 
                                            adminHomeFrame.setVisible(false); 
                                            adminHomeFrame.setVisible(true); 
 
                                        } 
                                    }); 
 
                                    yesButton.addActionListener(new ActionListener() { 
                                        @Override 
                                        public void actionPerformed(ActionEvent e) { 
                                            JFrame logoutSuccessFrame = new JFrame( 
                                            "Complaint 
 
Management System 
                                            "); 
 
logoutSuccessFrame.setVisible(true); 
 
                                            
logoutSuccessFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
                                            logoutSuccessFrame.setSize(800, 400); 
 
                                            JPanel panel = new JPanel(); 
                                            logoutSuccessFrame.add(panel); 
                                            JLabel successLabel = new JLabel("Logout Successful!"); 
                                            panel.add(successLabel); 
                                        } 
                                    }); 
                                    noButton.addActionListener(new ActionListener() { 
                                        @Override 
                                        public void actionPerformed(ActionEvent e) { 
                                            logoutConfirmFrame.dispose(); 
                                        } 
                                    }); 
                                } 
                            }); 
                        } else { 
                            JFrame authenticationFailedFrame = new JFrame("Complaint Management 
 
System 
                            "); 
 
authenticationFailedFrame.setVisible(true); 
 
                            
authenticationFailedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 
                            authenticationFailedFrame.setSize(800, 400); 
                            JPanel panel = new JPanel(); 
                            authenticationFailedFrame.add(panel); 
                            JLabel failedLabel = new JLabel("Authentication Failed!"); 
                            panel.add(failedLabel); 
                            JButton backButton = new JButton("Back"); 
                            panel.add(backButton); 
                            backButton.addActionListener(new ActionListener() { 
                                @Override 
                                public void actionPerformed(ActionEvent e) { 
                                    frame.setVisible(false); 
                                    frame.setVisible(true); 
 
                                } 
                            }); 
 
                        } 
                    } 
 
                }); 
                backButton.addActionListener(new ActionListener() { 
@Override 
public void actionPerformed(ActionEvent e) { 
adminLoginFrame.dispose(); 
} 
}); 
} 
}); 
customerLogin.addActionListener(new ActionListener() { 
@Override 
public void actionPerformed(ActionEvent e) { 
JFrame customerLoginFrame = new JFrame("Customer Login"); 
customerLoginFrame.setVisible(true); 
customerLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
customerLoginFrame.setSize(800, 400); 
JPanel panel = new JPanel(); 
customerLoginFrame.add(panel); 
JLabel userNameLabel = new JLabel("Username:"); 
panel.add(userNameLabel); 
JTextField userNameTextField = new JTextField(20); 
panel.add(userNameTextField); 
JLabel passwordLabel = new JLabel("Password:"); 
panel.add(passwordLabel); 
JPasswordField passwordField = new JPasswordField(20); 
panel.add(passwordField); 
JButton loginButton = new JButton("Login"); 
panel.add(loginButton); 
JButton backButton = new JButton("Back"); 
panel.add(backButton); 
String loginname = userNameTextField.getText(); 
String loginpass = passwordField.getText(); 
loginButton.addActionListener(new ActionListener() { 
@Override 
public void actionPerformed(ActionEvent e) { 
String user = userNameTextField.getText(); 
String pass = new String(passwordField.getPassword()); 
if (user.equals("bayzid") && pass.equals("2021360288") || user.equals("arin") 
&& pass.equals("2021360286") || user.equals("Shakil") && 
pass.equals("2021360088")) { 
JFrame customerHomeFrame = new JFrame("Customer"); 
customerHomeFrame.setVisible(true); 
customerHomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
customerHomeFrame.setSize(800, 400); 
JPanel panel = new JPanel(); 
customerHomeFrame.add(panel); 
JButton addComplaintButton = new JButton("Add Complaint"); 
panel.add(addComplaintButton); 
panel.add(addComplaintButton); 
addComplaintButton.addActionListener(new ActionListener() { 
@Override 
public void actionPerformed(ActionEvent e) { 
JFrame complaintFrame = new JFrame("Customer"); 
complaintFrame.setVisible(true); 
complaintFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
complaintFrame.setSize(800, 400); 
JPanel panel = new JPanel(); 
complaintFrame.add(panel); 
                                    JLabel complaintLabel = new JLabel("Describe Your Complaint:"); 
                                    panel.add(complaintLabel); 
                                    JTextArea complaintTextArea = new JTextArea(20, 20); 
                                    panel.add(complaintTextArea); 
                                    JButton submitButton = new JButton("Submit"); 
                                    panel.add(submitButton); 
                                    JButton backButton = new JButton("Back"); 
                                    panel.add(backButton); 
                                    submitButton.addActionListener(new ActionListener() { 
 
                                        @Override 
                                        public void actionPerformed(ActionEvent e) { 
                                            JFrame successFrame = new JFrame("Success"); 
                                            successFrame.setVisible(true); 
 
                                            
successFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
                                            successFrame.setSize(800, 400); 
                                            JPanel panel = new JPanel(); 
                                            successFrame.add(panel); 
                                            JLabel successLabel = new JLabel("Your complaint has been added 
 
successfully 
                                            !"); 
 
panel.add(successLabel); 
                                            JButton okButton = new JButton("Ok"); 
                                            panel.add(okButton); 
                                            okButton.addActionListener(new ActionListener() { 
                                                @Override 
                                                public void actionPerformed(ActionEvent e) { 
                                                    successFrame.dispose(); 
                                                } 
                                            }); 
                                            String complaint = complaintTextArea.getText(); 
                                            try { 
                                                PrintWriter comlaintwriter = new PrintWriter(new 
FileOutputStream(complaine, true)); 
 
                                                comlaintwriter.append("# " + complaint + "**\n\n"); 
                                                comlaintwriter.close(); 
                                            } catch (IOException acFile) { 
                                                acFile.printStackTrace(); 
                                            } 
                                        } 
                                    }); 
                                    backButton.addActionListener(new ActionListener() { 
                                        @Override 
                                        public void actionPerformed(ActionEvent e) { 
                                            complaintFrame.dispose(); 
                                        } 
 
                                    }); 
                                } 
                            }); 
                            JButton viewComplaintListButton = new JButton("View Complaint List"); 
                            panel.add(viewComplaintListButton); 
                            JButton deleteComplaintButton = new JButton("Delete Complaint"); 
panel.add(deleteComplaintButton); 
JButton viewAdminReplyButton = new JButton("View Admin Reply"); 
panel.add(viewAdminReplyButton); 
JButton logoutButton = new JButton("Logout"); 
panel.add(logoutButton); 
deleteComplaintButton.addActionListener(new ActionListener() { 
@Override 
public void actionPerformed(ActionEvent e) { 
JFrame deleteComplaintFrame = new JFrame("Delete Complaint"); 
deleteComplaintFrame.setVisible(true); 
deleteComplaintFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
deleteComplaintFrame.setSize(800, 400); 
JPanel panel = new JPanel(); 
deleteComplaintFrame.add(panel); 
JLabel failedLabel = new JLabel("This option is not available at this 
moment 
, coming soon 
."); 
panel.add(failedLabel); 
JButton backButton = new JButton("Back"); 
panel.add(backButton); 
backButton.addActionListener(new ActionListener() { 
@Override 
public void actionPerformed(ActionEvent e) { 
                                            customerHomeFrame.setVisible(false); 
                                            customerHomeFrame.setVisible(true); 
 
                                        } 
                                    }); 
 
                                } 
                            }); 
                            viewAdminReplyButton.addActionListener(new ActionListener() { 
                                @Override 
 
                                public void actionPerformed(ActionEvent e) { 
                                    JFrame viewAdminReplyButton = new JFrame("View Admin Reply"); 
                                    viewAdminReplyButton.setVisible(true); 
 
                                    
viewAdminReplyButton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 
                                    viewAdminReplyButton.setSize(800, 400); 
                                    JPanel panel = new JPanel(); 
                                    viewAdminReplyButton.add(panel); 
                                    JLabel failedLabel = new JLabel("This option is not available at this 
 
moment 
                                    , coming soon 
                                    ."); 
 
panel.add(failedLabel); 
                                    JButton backButton = new JButton("Back"); 
                                    panel.add(backButton); 
                                    backButton.addActionListener(new ActionListener() { 
                                        @Override 
                                        public void actionPerformed(ActionEvent e) { 
                                            customerHomeFrame.setVisible(false); 
                                            customerHomeFrame.setVisible(true); 
 
                                        } 
                                    }); 
 
                                } 
                            }); 
                            viewComplaintListButton.addActionListener(new ActionListener() { 
                                @Override 
                                public void actionPerformed(ActionEvent e) { 
                                    JFrame viewComplaintListFrame = new JFrame("View Complaint List"); 
                                    viewComplaintListFrame.setVisible(true); 
 
                                    
viewComplaintListFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 
                                    viewComplaintListFrame.setSize(800, 400); 
                                    JPanel panel = new JPanel(); 
                                    viewComplaintListFrame.add(panel); 
                                    JLabel failedLabel = new JLabel( 
                                    "You are not the admin, only the admin 
 
can view the complaint list. 
                                    "); 
 
panel.add(failedLabel); 
 
                                    JButton backButton = new JButton("Back"); 
                                    panel.add(backButton); 
                                    backButton.addActionListener(new ActionListener() { 
                                        @Override 
                                        public void actionPerformed(ActionEvent e) { 
                                            customerHomeFrame.setVisible(false); 
                                            customerHomeFrame.setVisible(true); 
 
                                        } 
                                    }); 
 
                                } 
                            }); 
                            logoutButton.addActionListener(new ActionListener() { 
                                @Override 
                                public void actionPerformed(ActionEvent e) { 
                                    JFrame logoutConfirmFrame = new JFrame("Customer"); 
                                    logoutConfirmFrame.setVisible(true); 
 
                                    
logoutConfirmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 
                                    logoutConfirmFrame.setSize(800, 400); 
                                    JPanel panel = new JPanel(); 
                                    logoutConfirmFrame.add(panel); 
                                    JLabel confirmLabel = new JLabel("Are you sure you want to logout?"); 
                                    panel.add(confirmLabel); 
                                    JButton yesButton = new JButton("Yes"); 
                                    panel.add(yesButton); 
                                    JButton noButton = new JButton("No"); 
                                    panel.add(noButton); 
                                    yesButton.addActionListener(new ActionListener() { 
                                        @Override 
                                        public void actionPerformed(ActionEvent e) { 
                                            JFrame logoutSuccessFrame = new JFrame( 
                                            "Complaint 
 
Management System 
                                            "); 
 
logoutSuccessFrame.setVisible(true); 
 
                                            
logoutSuccessFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
                                            logoutSuccessFrame.setSize(800, 400); 
 
                                            JPanel panel = new JPanel(); 
                                            logoutSuccessFrame.add(panel); 
                                            JLabel successLabel = new JLabel("Logout Successful!"); 
                                            panel.add(successLabel); 
                                        } 
                                    }); 
                                    noButton.addActionListener(new ActionListener() { 
                                        @Override 
                                        public void actionPerformed(ActionEvent e) { 
                                            logoutConfirmFrame.dispose(); 
                                        } 
                                    }); 
                                } 
                            }); 
                        } else { 
                            JFrame authenticationFailedFrame = new JFrame("Complaint Management 
 
System 
                            "); 
 
authenticationFailedFrame.setVisible(true); 
 
                            
authenticationFailedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 
                            authenticationFailedFrame.setSize(800, 400); 
                            JPanel panel = new JPanel(); 
                            authenticationFailedFrame.add(panel); 
                            JLabel failedLabel = new JLabel("Authentication Failed!"); 
                            panel.add(failedLabel); 
                            JButton backButton = new JButton("Back"); 
 
                            panel.add(backButton); 
                            backButton.addActionListener(new ActionListener() { 
                                @Override 
                                public void actionPerformed(ActionEvent e) { 
                                    frame.setVisible(false); 
                                    frame.setVisible(true); 
 
                                } 
                            }); 
 
                        } 
                    } 
                } 
                ); 
 
                backButton.addActionListener( 
                        new ActionListener() { 
                    @Override 
                    public void actionPerformed(ActionEvent e 
                    ) { 
                        customerLoginFrame.dispose(); 
                    } 
                } 
                ); 
            } 
        }); 
        createAccount.addActionListener( 
                new ActionListener() { 
            @Override 
            public void actionPerformed(ActionEvent e 
            ) { 
                JFrame createAccountFrame = new JFrame("Create Account"); 
                createAccountFrame.setVisible(true); 
                createAccountFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
createAccountFrame.setSize(800, 400); 
JPanel panel = new JPanel(); 
createAccountFrame.add(panel); 
JLabel userNameLabel = new JLabel( 
"Enter a new Username at least 4 characters: 
"); 
panel.add(userNameLabel); 
JTextField userNameTextField = new JTextField(20); 
panel.add(userNameTextField); 
JLabel passwordLabel = new JLabel("Enter a new Password at least 8 characters:"); 
panel.add(passwordLabel); 
JPasswordField passwordField = new JPasswordField(20); 
panel.add(passwordField); 
JLabel genderLabel = new JLabel("Gender:"); 
panel.add(genderLabel); 
String[] genderOptions = {"Male", "Female", "Other"}; 
JComboBox<String> genderComboBox = new JComboBox<String>(genderOptions); 
panel.add(genderComboBox); 
JButton createAccountButton = new JButton("Create Account"); 
panel.add(createAccountButton); 
JButton backButton = new JButton("Back"); 
panel.add(backButton); 
createAccountButton.addActionListener(new ActionListener() { 
@Override 
public void actionPerformed(ActionEvent e) { 
String username = userNameTextField.getText(); 
String password = passwordField.getText(); 
                        if (username.length() >= 4 && password.length() >= 8) { 
                            JFrame successFrame = new JFrame("Create Account"); 
                            successFrame.setVisible(true); 
                            successFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
                            successFrame.setSize(800, 400); 
                            try { 
                                PrintWriter inputAccount = new PrintWriter(new FileOutputStream(account, 
                                        true)); 
 
                                inputAccount.append(username + " " + password + "\n"); 
                                inputAccount.close(); 
                            } catch (IOException acFile) { 
                                acFile.printStackTrace(); 
                            } 
                            JPanel panel = new JPanel(); 
                            successFrame.add(panel); 
                            JLabel successLabel = new JLabel("Account created successfully!"); 
                            panel.add(successLabel); 
                            JButton backButton = new JButton("Back"); 
                            panel.add(backButton); 
                            backButton.addActionListener(new ActionListener() { 
                                @Override 
                                public void actionPerformed(ActionEvent e) { 
                                    successFrame.dispose(); 
 
                                } 
                            }); 
                        } else { 
                            JFrame errorFrame = new JFrame("Create Account"); 
                            errorFrame.setVisible(true); 
                            errorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
                            errorFrame.setSize(800, 400); 
                            JPanel panel = new JPanel(); 
                            errorFrame.add(panel); 
                            JLabel errorLabel = new JLabel( 
                            "account does not created please fulfill the 
 
conditions. 
                            "); 
 
panel.add(errorLabel); 
                            JButton backButton = new JButton("Back"); 
                            panel.add(backButton); 
                            backButton.addActionListener(new ActionListener() { 
                                @Override 
                                public void actionPerformed(ActionEvent e) { 
                                    errorFrame.dispose(); 
                                } 
                            }); 
                        } 
                    } 
                }); 
                createAccountButton.addActionListener(new ActionListener() { 
                    @Override 
                    public void actionPerformed(ActionEvent e) { 
                        String username = userNameTextField.getText(); 
                        char[] password = passwordField.getPassword(); 
                        if (username.length() < 4 || password.length < 8) { 
                            JFrame errorFrame = new JFrame("Create Account"); 
                            errorFrame.setVisible(true); 
                            errorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
                            errorFrame.setSize(800, 400); 
                            JPanel panel = new JPanel(); 
                            errorFrame.add(panel); 
                            JLabel errorLabel = new JLabel( 
                            "Username must be at least 4 characters and 
 
password must be at least 8 characters. 
                            "); 
 
panel.add(errorLabel); 
                            JButton backButton = new JButton("Back"); 
                            panel.add(backButton); 
                            backButton.addActionListener(new ActionListener() { 
                                @Override 
                                public void actionPerformed(ActionEvent e) { 
                                    errorFrame.dispose(); 
                                } 
                            }); 
                        } 
                    } 
                }); 
                backButton.addActionListener(new ActionListener() { 
                    @Override 
public void actionPerformed(ActionEvent e) { 
createAccountFrame.dispose(); 
} 
}); 
} 
} 
); 
others.addActionListener( 
new ActionListener() { 
@Override 
public void actionPerformed(ActionEvent e 
) { 
JFrame othersFrame = new JFrame("Others"); 
othersFrame.setVisible(true); 
othersFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
othersFrame.setSize(800, 400); 
JPanel panel = new JPanel(); 
othersFrame.add(panel); 
JLabel emergencyContactLabel = new JLabel("Emergency Contact:"); 
panel.add(emergencyContactLabel); 
JLabel contact1Label = new JLabel("0161111114, "); 
panel.add(contact1Label); 
JLabel contact2Label = new JLabel(" 0191234454."); 
panel.add(contact2Label); 
JButton backButton = new JButton(" Back"); 
panel.add(backButton); 
backButton.addActionListener(new ActionListener() { 
                    @Override 
                    public void actionPerformed(ActionEvent e) { 
                        othersFrame.dispose(); 
                    } 
                }); 
            } 
        } 
        ); 
    } 
}