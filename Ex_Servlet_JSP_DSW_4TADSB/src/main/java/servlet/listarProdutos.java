package servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Produto;

@WebServlet(name = "listarProdutos", urlPatterns = {"/index.html","/lista-produtos"})
public class listarProdutos extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Produto p1 = new Produto(1, "Produto 1", "descrição descrição descrição descrição descrição descrição descrição descrição descrição", 29.90);
        Produto p2 = new Produto(2, "Produto 2", "descrição descrição descrição descrição descrição descrição descrição descrição descrição", 20.90);
        Produto p3 = new Produto(3, "Produto 3", "descrição descrição descrição descrição descrição descrição descrição descrição descrição", 31.90);
        Produto p4 = new Produto(4, "Produto 4", "descrição descrição descrição descrição descrição descrição descrição descrição descrição", 32.90);
        Produto p5 = new Produto(5, "Produto 5", "descrição descrição descrição descrição descrição descrição descrição descrição descrição", 33.90);
        Produto p6 = new Produto(6, "Produto 6", "descrição descrição descrição descrição descrição descrição descrição descrição descrição", 34.90);
        Produto p7 = new Produto(7, "Produto 7", "descrição descrição descrição descrição descrição descrição descrição descrição descrição", 35.90);
        Produto p8 = new Produto(8, "Produto 8", "descrição descrição descrição descrição descrição descrição descrição descrição descrição", 36.90);
        Produto p9 = new Produto(9, "Produto 9", "descrição descrição descrição descrição descrição descrição descrição descrição descrição", 37.90);
        Produto p10 = new Produto(10, "Produto 10", "descrição descrição descrição descrição descrição descrição descrição descrição descrição", 38.90);
        Produto p11 = new Produto(11, "Produto 11", "descrição descrição descrição descrição descrição descrição descrição descrição descrição", 39.90);
        Produto p12 = new Produto(12, "Produto 12", "descrição descrição descrição descrição descrição descrição descrição descrição descrição", 40.90);
        Produto p13 = new Produto(13, "Produto 13", "descrição descrição descrição descrição descrição descrição descrição descrição descrição", 41.90);
        Produto p14 = new Produto(14, "Produto 14", "descrição descrição descrição descrição descrição descrição descrição descrição descrição", 42.90);
        Produto p15 = new Produto(15, "Produto 15", "descrição descrição descrição descrição descrição descrição descrição descrição descrição", 43.90);
        Produto p16 = new Produto(16, "Produto 16", "descrição descrição descrição descrição descrição descrição descrição descrição descrição", 44.90);
        Produto p17 = new Produto(17, "Produto 17", "descrição descrição descrição descrição descrição descrição descrição descrição descrição", 45.90);
        Produto p18 = new Produto(18, "Produto 18", "descrição descrição descrição descrição descrição descrição descrição descrição descrição", 46.90);
        Produto p19 = new Produto(19, "Produto 19", "descrição descrição descrição descrição descrição descrição descrição descrição descrição", 47.90);
        Produto p20 = new Produto(20, "Produto 20", "descrição descrição descrição descrição descrição descrição descrição descrição descrição", 48.90);
        
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        produtos.add(p5);
        produtos.add(p6);
        produtos.add(p7);
        produtos.add(p8);
        produtos.add(p9);
        produtos.add(p10);
        produtos.add(p11);
        produtos.add(p12);
        produtos.add(p13);
        produtos.add(p14);
        produtos.add(p15);
        produtos.add(p16);
        produtos.add(p17);
        produtos.add(p18);
        produtos.add(p19);
        produtos.add(p20);

        request.setAttribute("listaProdutos", produtos);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/produto.jsp");
        dispatcher.forward(request, response);
    }

}
