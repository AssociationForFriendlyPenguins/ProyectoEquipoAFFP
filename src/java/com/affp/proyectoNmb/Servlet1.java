/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.affp.proyectoNmb;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author santi
 */
@WebServlet(name = "Servlet1", urlPatterns = {"/Servlet1"})
public class Servlet1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>¿Qué significa mi nombre?</title>");            
            out.println("</head>");
            out.println("<body>");
            String Nombre = null;
            Nombre = request.getParameter("Nmb");
            out.println("<a href=\"Jsp1.jsp\"><h2>Regresar</h2></a>");
            out.println("<h1>¿Qué significa " + Nombre +"?</h1>");
            if (Nombre.equals("David")){
                out.println("El nombre David proveniente Daoud o Yadad que significa \"amado\" o \"querido\"." + "<br>"
                        + "ademas el nombre David tambien significa \"la persona elegida por el señor,\"" + "<br>"
                        + "como puedes ver este nombre es bastante religioso." + "<br>");
            out.println("<img src=\"NmbDavid.jpg\"alt=\"\" height=\"500\" />");
            }
            if (Nombre.equals("Diego")){
                out.println("Diego es un nombre en español, que se consigna en los documentos medievales como Didaco," + "<br>"
                        + " Didacus, Didago o Diago. Es un derivado del griego (en este, Ντιέγκο‎), que significa moderado." + "<br>"
                        + "Tambien puede significar \"educado\", \"instruido\", \"sabio\"." + "<br>");
            out.println("<img src=\"Diego.jpg\"alt=\"\" height=\"500\" />");
            }
            if (Nombre.equals("Miguel")){
                out.println("La palabra Miguel viene del hebreo \"mica'el\" ¿\"quién como El ?\"." + "<br>"
                        + "En otros idiomas tenemos a Michel, Michael, Mijail." + "<br>"
                        + "Se refiere a un ángel que, en su nombre, glorifica el nombre de Dios." + "<br>");
                            out.println("<img src=\"Miguel.jpg\"alt=\"\" height=\"500\" />");
            }
            if (Nombre.equals("Angel")){
                out.println("Ángel es un nombre propio masculino de origen griego en su variante en español." + "<br>"
                        + " El nombre procede del latín angelus, que a su vez deriva del griego " + "<br>"
                        + "ággelos, que quiere decir \"mensajero\"." + "<br>");
                            out.println("<img src=\"Angel.jpg\"alt=\"\" height=\"500\" />");
            }
            if (Nombre.equals("Geraldine")){
                out.println("Este nombre es muy conocido como la variante Geraldina y compuesta de las palabras gar-hard" + "<br>"
                        + ", la cual tiene como significado: “fuerte y valiente”, que a su vez se traduce como “reina con la lanza”." + "<br>"
                        + " En la actualidad también podemos encontrarla como: “la reina fuerte”.\n" + "<br>");
                                    out.println("<img src=\"Geraldine.jpg\"alt=\"\" height=\"500\" />");
            }
            if (Nombre.equals("German")){
                out.println("Germán es un nombre masculino de orígenes germánicos, significa \"Aquel que es un guerrero\" o \"Hombre de guerra\"" + "<br>"
                        + ". En su origen latino lo llevan a la palabra \"Germanus\", cambiando su significado a \"Aquel que es un hermano\".\n");
                            out.println("<img src=\"German.jpg\"alt=\"\" height=\"500\" />" + "<br>");
            }
            if (Nombre.equals("Adriana")) {
                out.println("Antigua ciudad a orillas del Mar Adrático" + "<br>");
                out.println("<img src=\"Adriana.jpg\"alt=\"\" height=\"500\" />" + "<br>");
            }
                if (Nombre.equals("Julio")) {
                    out.println("Joven, deriva de los jóvenes que recién tienen barba" + "<br>");
                    out.println("<img src=\"Julio.jpg\"alt=\"\" height=\"500\" />" + "<br>");
                }
                    if (Nombre.equals("Itztli")){
                        out.println("Obsidiana" + "<br>");
                        out.println("<img src=\"obsidiana.jpg\"alt=\"\" height=\"500\" />" + "<br>");
                    }
                    if (Nombre.equals("Diana")){
                        out.println("Princesa, aquella de naturaleza divina" + "<br>");
                        out.println("<img src=\"Diana.jpeg\"alt=\"\" height=\"500\" />" + "<br>");
                    }
                    if (Nombre.equals("Vania")){
                        out.println("Significa poseedora de la gracia de Dios" + "<br>");
                        out.println("<img src=\"Vania.jpeg\"alt=\"\" height=\"500\" />" + "<br>");
                    }
                    if (Nombre.equals("Axel")){
                        out.println("Significa padre de la paz" + "<br>");
                        out.println("<img src=\"Axel.jpeg\"alt=\"\" height=\"500\" />" + "<br>");
                    }
                    if (Nombre.equals("Santiago")){
                        out.println("Significa Dios recompensará" + "<br>");
                        out.println("<img src=\"Santiago.jpeg\"alt=\"\" height=\"500\" />" + "<br>");
                    }
                    if (Nombre.equals("Jessica")){
                        out.println("Jessica significa la que puede ver el futuro" + "<br>");
                        out.println("<img src=\"Jessica.jpeg\"alt=\"\" height=\"500\" />" + "<br>");
                    }
                    if (Nombre.equals("Hugo")){
                        out.println("Significa hombre inteligente" + "<br>");
                        out.println("<img src=\"Hugo.jpeg\"alt=\"\" height=\"500\" />" + "<br>");
                    }
                    if (Nombre.equals("Josue")){
                        out.println("Significa Yahvé es el salvador" + "<br>");
                        out.println("<img src=\"Josue.jpeg\"alt=\"\" height=\"500\" />" + "<br>");
                    }
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
