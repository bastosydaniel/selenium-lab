package testesparaprova.test;

import org.junit.BeforeClass;
import org.junit.Test;
import testesparaprova.pageObject.ProdutoPO;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;

public class ProdutoTest extends BaseTest{

    private static ProdutoPO produtoPage;

    @BeforeClass
    public static void prepararTestes() { produtoPage = new ProdutoPO((driver));}


    @Test
    public  void TC001_deveFecharTelaDeCadastroAoClicarNoX() throws InterruptedException {
        produtoPage.buttonCriar.click();
        produtoPage.buttonSairCadastro.click();

        assertFalse(produtoPage.divCadastro.isDisplayed());
    }

    @Test
    public void TC002_deveFecharTelaDeCadastroAoClicarNoBotaoSair() throws InterruptedException {
        produtoPage.buttonCriar.click();
        produtoPage.buttonSairCadastro.click();

        assertFalse(produtoPage.divCadastro.isDisplayed());
    }

    @Test
    public void TC005_naoDeveCadastrarProdutoSemTodosCamposPreenchidos () throws InterruptedException {
        produtoPage.buttonCriar.click();

        String mensagem = produtoPage.obterMensagem();
        
        assertEquals("Todos os campos são obrigatórios para o cadastro!",mensagem);
    }


}
