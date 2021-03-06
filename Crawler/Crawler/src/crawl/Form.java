/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crawl;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Queue;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.ling.Sentence;
import edu.stanford.nlp.process.DocumentPreprocessor;
import java.io.File;


/**
 *
 * @author KyThuat88
 */
public class Form extends javax.swing.JFrame {
    private static Set<String> urls;
	private static Set<String> url_extracted;
	private static Set<String> id_containers;
	private static Set<String> class_containers;
	private static Queue<String> itemCheck = new LinkedList<String>();
	private static String output_folder;
	private static String output_file;
	private static String output_type;
	private static boolean same_domain;
	private static long max_item_check;
    /**
     * Creates new form Form
     */
    public Form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_ok = new javax.swing.JButton();
        link = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("???ng d???ng l???y d??? li???u website");

        btn_ok.setText("Ti???n h??nh");
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });

        jLabel2.setText("Link:");

        jLabel3.setText("T???o th?? m???c output2 v?? ch???nh ???????ng d???n trong file config tr?????c khi run");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(link, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ok)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(link, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
         String oldContent = "";
          BufferedReader reader = null;
          FileWriter writer = null;
        try {
            String url = link.getText().toString();
            String content = "\n#url to crawl\n" +
                        "urls = "+url+"\n" +
                        "same.domain = true\n" +
                        "output.type = file\n" +
                        "output.folder = D:/output2/\n" +
                        "output.file = D:/output2/vietnam.txt\n" +
                        "max.item.check = 10000\n" +
                        "id.containers = wrapper_container,body\n" +
                        "class.containers = container,content,pContent,main";
            File file =new File("D:\\NetBeanProjects\\Crawler\\Crawler\\config\\crawl.cfg.txt");
            if(!file.exists()){
               file.createNewFile();
            }
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            reader = new BufferedReader(new FileReader(file));
             
            //Reading all the lines of input text file into oldContent
             
            String line = reader.readLine();
             
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                 
                line = reader.readLine();
            }
             
            //Replacing oldString with newString in the oldContent
             
            String newContent = oldContent.replaceAll(oldContent, content);
            writer = new FileWriter(file);
             
            writer.write(newContent);
            writer.close();
//            bw.write(content);
//            bw.close();
//            String FILENAME = "D:\\NetBeanProjects\\Crawler\\Crawler\\config\\crawl.cfg.txt";
		String configFileName = "D:\\NetBeanProjects\\Crawler\\Crawler\\config\\crawl.cfg.txt";
		String urlExtractedFileName = "D:\\NetBeanProjects\\Crawler\\Crawler\\config\\url-extracted.vars";
		fw = new FileWriter(urlExtractedFileName, true);
		Writer out = null;
		try {                    
			loadUrlExtracted(urlExtractedFileName);
			loadConfig(configFileName);
			if (output_type.equals("file")) {
				out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output_file, true), "UTF8"));
			}
			while (urls.size() > 0) {
				String urlProcess = (String) urls.iterator().next();
				if (!url_extracted.contains(urlProcess)) {
					if (output_type.equals("file")) {
						parsing(urlProcess, out);
					} else if (output_type.equals("folder")) {
						parsing(urlProcess);
					}
					print("Url: (%s)", urlProcess);
					fw.write(urlProcess + "\n");
					urls.remove(urlProcess);
					url_extracted.add(urlProcess);
				}
			}
			if (output_type.equals("file")) {
				out.close();
			}
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fw.close();
			if (output_type.equals("file")) {
				out.close();
			}
		}
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_okActionPerformed

    
    //edit
    private static void loadConfig(String configFileName) throws IOException {
		InputStream inputStream = null;
		try {
			Properties prop = new Properties();
			inputStream = new FileInputStream(configFileName);
			prop.load(inputStream);
			String sUrls = prop.getProperty("urls");
			String[] arrUrls = sUrls.split(",");
			urls = new HashSet<String>(Arrays.asList(arrUrls));
			url_extracted.removeAll(Arrays.asList(arrUrls));
			output_type = prop.getProperty("output.type");
			output_folder = prop.getProperty("output.folder");
			output_file = prop.getProperty("output.file");
			same_domain = Boolean.parseBoolean(prop.getProperty("same.domain"));
			max_item_check = Long.parseLong(prop.getProperty("max.item.check"));
			String sIdContainers = prop.getProperty("id.containers");
			String[] arrIdContainers = sIdContainers.split(",");
			id_containers = new HashSet<String>(Arrays.asList(arrIdContainers));
			String sClassContainers = prop.getProperty("class.containers");
			String[] arrClassContainers = sClassContainers.split(",");
			class_containers = new HashSet<String>(Arrays.asList(arrClassContainers));
			inputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			inputStream.close();
		}
	}

	private static void loadUrlExtracted(String urlExtractedFileName) throws IOException {
		BufferedReader br = null;
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader(urlExtractedFileName));
			url_extracted = new HashSet<>();
			while ((sCurrentLine = br.readLine()) != null) {
				url_extracted.add(sCurrentLine);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			br.close();
		}

	}

	public static String getDomainName(String url) throws MalformedURLException {
		if (!url.startsWith("http") && !url.startsWith("https")) {
			url = "http://" + url;
		}
		URL netUrl = new URL(url);
		String host = netUrl.getHost();
		if (host.startsWith("www")) {
			host = host.substring("www".length() + 1);
		}
		return host;
	}

	private static void parsing(String url, Writer fw) throws MalformedURLException {
		String domainName = getDomainName(url);
		print("%s", domainName);
		try {
			Document doc = Jsoup.connect(url).get();
			Element elementContainer = null;
			for (String idContainer : id_containers) {
				if (doc.getElementById(idContainer) != null) {
					elementContainer = doc.getElementById(idContainer);
					break;
				}
			}
			for (String classContainer : class_containers) {
				if (doc.getElementsByClass(classContainer).size() > 0) {
					elementContainer = doc.getElementsByClass(classContainer).first();
					break;
				}
			}
			if (elementContainer == null) {
				elementContainer = doc.body();
			}
			Elements paragraphs = elementContainer.select("p");
			Elements links = doc.select("a[href]");
			for (Element link : links) {
				String newUrl = link.attr("abs:href");
				if (!same_domain || getDomainName(newUrl).contains(domainName)) {
					if (!url_extracted.contains(newUrl) && !urls.contains(newUrl)
							&& (newUrl.contains(".htm") || newUrl.contains(".html"))) {
						urls.add(newUrl);
					}
				}
			}

			for (Element paragraph : paragraphs) {
				String text = paragraph.text().toLowerCase().trim();
				if (!text.equals("") && !itemCheck.contains(text)) {
					itemCheck.add(text);
					if (itemCheck.size() > max_item_check) {
						itemCheck.remove();
					}
					Reader reader = new StringReader(text);
					DocumentPreprocessor dp = new DocumentPreprocessor(reader);
					for (List<HasWord> sentence : dp) {
						String sentenceString = Sentence.listToString(sentence);
						fw.write(sentenceString + "\n");
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void parsing(String url) {
		try {
			StringBuffer content = new StringBuffer();

			Document doc = Jsoup.connect(url).get();
			Element elementContainer = null;
			for (String idContainer : id_containers) {
				if (doc.getElementById(idContainer) != null) {
					elementContainer = doc.getElementById(idContainer);
					break;
				}
			}
			for (String classContainer : class_containers) {
				if (doc.getElementsByClass(classContainer).size() > 0) {
					elementContainer = doc.getElementsByClass(classContainer).first();
					break;
				}
			}
			if (elementContainer == null) {
				elementContainer = doc.body();
			}
			Elements paragraphs = elementContainer.select("p");
			Elements links = doc.select("a[href]");
			for (Element link : links) {
				String newUrl = link.attr("abs:href");
				if (!url_extracted.contains(newUrl) && !urls.contains(newUrl)
						&& (newUrl.contains(".htm") || newUrl.contains(".html"))) {
					urls.add(newUrl);
				}
			}

			for (Element paragraph : paragraphs) {
				String text = paragraph.text().trim();
				if (!text.equals("")) {
					content.append(text);
					content.append('\n');
				}
			}
			String filename = url.substring(7).replace('/', '_').replace('?', '!') + ".txt";
			if (content.length() > 0) {
				if (output_type.equals("folder")) {
					Writer out = new BufferedWriter(
							new OutputStreamWriter(new FileOutputStream(output_folder + filename), "UTF8"));
					out.write(content.toString());
					out.close();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void print(String msg, Object... args) {
		System.out.println(String.format(msg, args));
	}
    
    
    //edit
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField link;
    // End of variables declaration//GEN-END:variables
}
