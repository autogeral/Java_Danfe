import br.com.swconsultoria.impressao.model.Impressao;
import br.com.swconsultoria.impressao.service.ImpressaoService;
import br.com.swconsultoria.impressao.util.ImpressaoUtil;
import net.sf.jasperreports.engine.JRException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class TesteImpressaoNFCe {

    public static void main(String[] args) {
        try {
            //Faça a leitura do Arquivo
            String xml = ImpressaoUtil.leArquivo("D:/tmp/51240702713285000133650010000265431000530861-nfe.xml");

            //Informe a Url de Consulta do NFCe de seu Estado

            /**
             * Av. Itu 400 anos nº111 – Bairro Novo Centro
             * UF: SP
             * CEP: 13.303-500
             * DDD: 11
             * Fone: 4886-9065
             */

            /**
             * Cidade: Salto
             * Órgão: Procon
             * Responsável: Eurice Carvalho de Araujo Gonçalves
             * Endereço: Rua José Revel, nº 270 – Centro
             * UF: SP
             * CEP: 13.320-020
             * E-mail: procon@salto.sp.gov.br (somente para dúvidas)
             */

            //String urlConsulta = "www.sefaznet.ac.gov.br/nfce/consulta";
            String urlConsulta = "www.nfce.fazenda.sp.gov.br/NFCeConsultaPublica/Paginas/ConsultaQRCode.aspx";
            //Aqui está pegando o Layout Padrão
            Impressao impressao = ImpressaoUtil.impressaoPadraoNFCe(xml, urlConsulta);

            //Faz a impressão em pdf File
            impressaoPdfArquivo(impressao);
            System.out.println("Impressão Pdf Arquivo OK");
        } catch (Exception e) {
            //Trate seus erros aqui
            e.printStackTrace();
        }
    }

    private static void impressaoPdfArquivo(Impressao impressao) throws IOException, JRException, ParserConfigurationException, SAXException {
        ImpressaoService.impressaoPdfArquivo(impressao, "D:/tmp/teste-nfce.pdf");
    }

}