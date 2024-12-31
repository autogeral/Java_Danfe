# Java-Danfe [![MIT License](https://img.shields.io/github/license/Samuel-Oliveira/Java_Danfe.svg) ](https://github.com/Samuel-Oliveira/Java_Danfe/blob/master/LICENSE) [![Maven Central](https://img.shields.io/maven-central/v/br.com.swconsultoria/java-danfe.svg?label=Maven%20Central)](https://search.maven.org/artifact/br.com.swconsultoria/java-danfe/1.8/jar)
Biblioteca para impressão de Documentos Fiscais

## Dúvidas, Sugestões ou Consultoria
[![Java Brasil](https://discordapp.com/api/guilds/519583346066587676/widget.png?style=banner2)](https://discord.gg/ZXpqnaV)

## Gostou do Projeto? Dê sua colaboração pelo Pix: 01713390108
<img src="https://swconsultoria.com.br/pix.png" width="200">

Para Iniciar : 
- Caso use Libs baixe o java-danfe-1.8.jar (https://github.com/Samuel-Oliveira/Java_Danfe/raw/master/java-danfe-1.8.jar) e o adicione às bibliotecas de Seu Projeto.

- Maven :
```xml
<dependency>
    <groupId>br.com.swconsultoria</groupId>
    <artifactId>java-danfe</artifactId>
    <version>1.8</version>
</dependency>
```

- Gradle :
```groovy
repositories {
    maven { 
        url = "https://oss.sonatype.org/content/repositories/snapshots" 
    }
}
dependencies {
    implementation "br.com.swconsultoria:java-danfe:1.8"
}
```

Veja a Wiki https://github.com/Samuel-Oliveira/Java_Danfe/wiki, para ter um Tutorial Completo.

________________________________________________________________________________________________

# Histórico de Versões

## v1.8 11/12/2024
- Adicionado Impressao CCE NFe

## v1.7 30/11/2024
- Adicionado PIX as descricoes de forma de pagamento NFCe

## v1.6 25/11/2023
- Correção de Jaspers
- Alteração de Valores errados CTe
- Alterado Logotipos padroes
- Implementado MDFe

## v1.5 03/11/2023
- Alterado inputStream para JasperReport
- Adicionado tela para testes no .jar

## v1.4 05/08/2023
- Correcao de NFC-e Cancelado

## v1.3 20/07/2023
- Correção de COnflito de Biblioteca

## v1.2 24/10/2022
- Correção de COnflito de Biblioteca

## v1.1 - 28/09/2021
- Implementado um recurso que permite ocultar o espaço reservado para os "Dados adicionais" a partir da segunda página.
- Fixado o tamanho do campo, "Informações adicionais" do produto/serviço para caber pelo menos 500 caractere que é o espaço máximo permitido na documentação. (Necessário para funcionar o item 1).
- Fixado o tamanho do campo código e descrição do produto/serviço. (Necessário para funcionar o item 1).
- Incluído regra para suprimir os dados do ISSQN quando o emitente não informar o IM (Inscrição municipal.
- Incluído data e hora da autorização do uso da NF-e no campo "Protocolo de autorização de uso".
- Alterado tamanho do campo data de emissão.
- Alinhado os campos, quantidade, peso bruto e peso líquido à direta na seção "Dados do transportador".
- Alterado cabeçalho da tabela "Dados dos produtos/serviços" para ser impresso a cada nova página.
- Alterado a palavra "Cálculo" para "CÁLCULO" no cabeçalho dos "dados dos produtos/serviços" a fim de manter o padrão das demais legenda.
- Alinhado os campos quant., valor unitário, valor total, base calculo, valor ICMS, valor IPI, alíquota ICMS, alíquota IPI da seção "Dados dos produto/serviços" à direita.
- Alterado tamanho e estilo da fonte do campo série e alinhado ao centro.
- Alinhado campo número da nf-e ao centro.
- Alterado tamanho da fonte da palavra "DANFE".
- Alterado tamanho da fonte da palavra "FOLHA n/n".

## v1.0 - 01/05/2021
- Versão Inicial da Biblioteca
- Adicionado impressão Padrão NFe
- Adicionado impressão Padrão NFCe

<img src="https://raw.githubusercontent.com/Samuel-Oliveira/Java_Danfe/master/jetbrains.png" width="200">
Thanks to JetBrains for supporting this project! https://www.jetbrains.com/?from=Java_NFe
