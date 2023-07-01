package testesparaprova.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Date;

public class ProdutoPO extends BasePO{
    @FindBy(id = "btn-adicionar")
    public WebElement buttonCriar;
    @FindBy(xpath = "/html/body/div/div[2]/table/tbody/tr/td[6]/button[1]")
    public WebElement buttonEditar;
    @FindBy(xpath = "/html/body/div/div[2]/table/tbody/tr/td[6]/button[2]")
    public  WebElement buttonExcluir;
    @FindBy(xpath = "//*[@id=\"mensagem\"]")
    public WebElement spanMensagem;
    @FindBy(xpath = "//*[@id=\"cadastro-produto\"]/div/div/div[1]/button")
    public WebElement buttonFecharCadastro;
    @FindBy(id="codigo")
    public WebElement inputCodigo;
    @FindBy(id="nome")
    public WebElement inputNome;
    @FindBy(id="quantidade")
    public WebElement inputQtde;
    @FindBy(id="valor")
    public WebElement inputValor;
    @FindBy(id="data")
    public WebElement inputData;
    @FindBy(id="btn-salvar")
    public WebElement buttonSalvarProduto;
    @FindBy(id = "btn-sair")
    public WebElement buttonSairCadastro;


    /**
     * Construtor base para a criação da fábrica de elementos (PageFactory)
     *
     * @param driver (Driver do navegador atual)
     */
    public ProdutoPO(WebDriver driver) {
        super(driver);
    }

    public String obterMensagem() {
        return this.spanMensagem.getText();
    }
    public void escrever(WebElement input, String texto) {
        input.clear();
        input.sendKeys(texto + Keys.TAB);
    }

    /**
     * Método que tenta executar a ação no sistema
     * @param codigo Codigo para tentativa de cadastro de um produto
     * @param nome Nome para tentativa de cadastro de um produto
     * @param qtde Quantidade para tentativa de cadastro de um produto
     * @param valor Valor para tentativa de cadastro de um produto
     * @param data Nome para tentativa de cadastro de um produto
     * */
    public void executarAcaoDeCadastrarProduto(String codigo, String nome, String qtde, String valor, String data){
//        escrever(inputCodigo,codigo);
//        escrever(inputNome,nome);
//        escrever(inputQtde,qtde);
//        escrever(inputValor,valor);
//        escrever(inputData,data);
        buttonSalvarProduto.click();
    }



}
