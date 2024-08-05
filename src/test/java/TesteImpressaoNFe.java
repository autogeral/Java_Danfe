import br.com.swconsultoria.impressao.model.Impressao;
import br.com.swconsultoria.impressao.service.ImpressaoService;
import br.com.swconsultoria.impressao.util.ImpressaoUtil;
import net.sf.jasperreports.engine.JRException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class TesteImpressaoNFe {

    public static void main(String[] args) {
        try {
            //Faça a leitura do Arquivo
            String []  arquivos = new String[]{"35240642580092002977551700000233101958367074",
                    "35240649871304000113550030002827081507635327",
                    "42240608771947000108550010000546641798632321"};

            for(String arquivo:arquivos) {
                String xml = ImpressaoUtil.leArquivo("D:/tmp/" + arquivo + ".xml");

                //Aqui está pegando o Layout Padrão
                Impressao impressao = ImpressaoUtil.impressaoPadraoNFe(xml);

                String destino = "D:/tmp/" + arquivo + ".pdf";
                //Faz a impressão em pdf File
                impressaoPdfArquivo(impressao, destino);
                System.out.println("Impressão Pdf Arquivo OK");
            }


        } catch (Exception e) {
            //Trate seus erros aqui
            e.printStackTrace();
        }
    }

    private static void impressaoPdfArquivo(Impressao impressao, String arquivo) throws IOException, JRException, ParserConfigurationException, SAXException {
        ImpressaoService.impressaoPdfArquivo(impressao, arquivo);
    }
}