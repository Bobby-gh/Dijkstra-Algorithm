package app;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.color.*;

import app.graph.Edge;
import app.graph.Graph;
import app.graph.Vertex;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(); // creating an instances of the graph class
        Vertex mainGate = new Vertex("Main Gate");
        Vertex greatHall = new Vertex("Great Hall");
        Vertex nb = new Vertex("N Block");
        Vertex jqb = new Vertex("JQB");
        Vertex balmeLibrary = new Vertex("Balme Library");
        Vertex nnb = new Vertex("NNB");
        Vertex ugcs = new Vertex("UGCS");
        Vertex cc = new Vertex("CC");
        Vertex voltaHall = new Vertex("Volta Hall");
        Vertex akuafoHall = new Vertex("Akuafo Hall");
        Vertex legonHall = new Vertex("Legon Hall");
        Vertex nightMarket = new Vertex("Night Market");
        Vertex BankingSquare = new Vertex("Banking Square");

        // Adding the nodes to the graph
        graph.addVertex(mainGate);
        graph.addVertex(greatHall);
        graph.addVertex(nb);
        graph.addVertex(jqb);
        graph.addVertex(balmeLibrary);
        graph.addVertex(nnb);
        graph.addVertex(ugcs);
        graph.addVertex(cc);
        graph.addVertex(voltaHall);
        graph.addVertex(akuafoHall);
        graph.addVertex(legonHall);
        graph.addVertex(nightMarket);
        graph.addVertex(BankingSquare);

        // adding the edges and getting the distances between vertices
        graph.addEdge(new Edge(mainGate, greatHall, 2400));
        graph.addEdge(new Edge(mainGate, nb, 1200));
        graph.addEdge(new Edge(mainGate, balmeLibrary, 1100));
        graph.addEdge(new Edge(mainGate, jqb, 700));
        graph.addEdge(new Edge(mainGate, nnb, 1600));
        graph.addEdge(new Edge(mainGate, ugcs, 2000));
        graph.addEdge(new Edge(mainGate, cc, 1100));
        graph.addEdge(new Edge(mainGate, voltaHall, 1300));
        graph.addEdge(new Edge(mainGate, akuafoHall, 1100));
        graph.addEdge(new Edge(mainGate, legonHall, 1200));
        graph.addEdge(new Edge(mainGate, nightMarket, 1000));
        graph.addEdge(new Edge(mainGate, BankingSquare, 990));

        graph.addEdge(new Edge(greatHall, jqb, 2000));
        graph.addEdge(new Edge(greatHall, nb, 1500));
        graph.addEdge(new Edge(greatHall, nnb, 1600));
        graph.addEdge(new Edge(greatHall, balmeLibrary, 1400));
        graph.addEdge(new Edge(greatHall, ugcs, 1400));
        graph.addEdge(new Edge(greatHall, cc, 1400));
        graph.addEdge(new Edge(greatHall, voltaHall, 1200));
        graph.addEdge(new Edge(greatHall, akuafoHall, 2500));
        graph.addEdge(new Edge(greatHall, legonHall, 1200));
        graph.addEdge(new Edge(greatHall, nightMarket, 2200));
        graph.addEdge(new Edge(greatHall, BankingSquare, 2000));

        graph.addEdge(new Edge(nnb, jqb, 1000));
        graph.addEdge(new Edge(nnb, nb, 200));
        graph.addEdge(new Edge(nnb, ugcs, 600));
        graph.addEdge(new Edge(nnb, balmeLibrary, 610));
        graph.addEdge(new Edge(nnb, cc, 1500));
        graph.addEdge(new Edge(nnb, voltaHall, 550));
        graph.addEdge(new Edge(nnb, akuafoHall, 1300));
        graph.addEdge(new Edge(nnb, legonHall, 1100));
        graph.addEdge(new Edge(nnb, nightMarket, 1900));
        graph.addEdge(new Edge(nnb, BankingSquare, 1890));

        graph.addEdge(new Edge(jqb, nb, 900));
        graph.addEdge(new Edge(jqb, ugcs, 850));
        graph.addEdge(new Edge(jqb, balmeLibrary, 840));
        graph.addEdge(new Edge(jqb, cc, 1200));
        graph.addEdge(new Edge(jqb, voltaHall, 1100));
        graph.addEdge(new Edge(jqb, legonHall, 1500));
        graph.addEdge(new Edge(jqb, nightMarket, 1600));
        graph.addEdge(new Edge(jqb, BankingSquare, 1580));

        graph.addEdge(new Edge(ugcs, nb, 550));
        graph.addEdge(new Edge(ugcs, balmeLibrary, 200));
        graph.addEdge(new Edge(ugcs, cc, 800));
        graph.addEdge(new Edge(ugcs, voltaHall, 500));
        graph.addEdge(new Edge(ugcs, akuafoHall, 650));
        graph.addEdge(new Edge(ugcs, legonHall, 600));
        graph.addEdge(new Edge(ugcs, nightMarket, 1300));
        graph.addEdge(new Edge(ugcs, BankingSquare, 1280));

        graph.addEdge(new Edge(balmeLibrary, nb, 500));
        graph.addEdge(new Edge(balmeLibrary, cc, 800));
        graph.addEdge(new Edge(balmeLibrary, voltaHall, 400));
        graph.addEdge(new Edge(balmeLibrary, akuafoHall, 270));
        graph.addEdge(new Edge(balmeLibrary, legonHall, 800));
        graph.addEdge(new Edge(balmeLibrary, nightMarket, 1400));
        graph.addEdge(new Edge(balmeLibrary, BankingSquare, 1389));

        graph.addEdge(new Edge(cc, voltaHall, 650));
        graph.addEdge(new Edge(cc, akuafoHall, 700));
        graph.addEdge(new Edge(cc, legonHall, 950));
        graph.addEdge(new Edge(cc, nightMarket, 900));
        graph.addEdge(new Edge(cc, BankingSquare, 800));

        graph.addEdge(new Edge(voltaHall, akuafoHall, 1400));
        graph.addEdge(new Edge(voltaHall, legonHall, 190));
        graph.addEdge(new Edge(voltaHall, nightMarket, 1500));
        graph.addEdge(new Edge(voltaHall, BankingSquare, 1470));

        graph.addEdge(new Edge(akuafoHall, legonHall, 700));
        graph.addEdge(new Edge(akuafoHall, nightMarket, 887));
        graph.addEdge(new Edge(akuafoHall, BankingSquare, 784));

        graph.addEdge(new Edge(legonHall, nightMarket, 1000));
        graph.addEdge(new Edge(legonHall, BankingSquare, 990));

        graph.addEdge(new Edge(nightMarket, BankingSquare, 10));

        // asking the user for the current location
        System.out.println("PLEASE CHOOSE YOUR CURRENT LOCATION:");
        graph.listPlaces(null);

        // User interface
        // The places available
        String places[] = { "Main Gate", "CC", "Night Market", "Volta Hall", "Akuafo Hall", "Legon Hall", "Great Hall",
                "NNB", "N Block", "JQB", "Balme Library", "UGCS", "Banking Square" };

        JFrame frame = new JFrame();// creating instance of JFrame

        // displaying places in the comboBox
        JLabel label = new JLabel();
        label.setText("DCIT 204 END OF SEMESTER PROJECT");
        label.setText("GROUP 33 TRANSPORT SOLUTION");
        label.setBounds(50, 0, 500, 50);
        frame.add(label);

        JComboBox sourceCombo = new JComboBox(places);
        sourceCombo.setBounds(50, 50, 200, 20);
        frame.add(sourceCombo);// adding button in JFrame

        JLabel label1 = new JLabel();
        label1.setText("Select Your Current Location ");
        label1.setBounds(25, 25, 300, 35);
        frame.add(label1);
        JLabel label2 = new JLabel();
        label2.setText("Kindly Select Your Destination");
        label2.setBounds(50, 73, 300, 40);
        frame.add(label2);
        JComboBox destinationCombo = new JComboBox(places);
        destinationCombo.setBounds(50, 100, 200, 20);
        frame.add(destinationCombo);// adding button in JFrame

        // inserting a lable displaying the shortest path text
        JLabel info = new JLabel();
        info.setText("The Shortest Path You can get is : ");
        info.setBackground(Color.blue);

        info.setBounds(10, 200, 300, 40);// x axis, y axis, width, height
        frame.add(info);

        JLabel shortestPathDisplay = new JLabel();
        shortestPathDisplay.setBounds(10, 220, 400, 40);// x axis, y axis, width, height
        frame.add(shortestPathDisplay);

        JLabel distanceDisplay = new JLabel();
        distanceDisplay.setBounds(10, 240, 400, 40);// x axis, y axis, width, height
        frame.add(distanceDisplay);

        JButton button = new JButton("Find Shortest Path");
        button.setBounds(100, 150, 150, 40);
        button.setBackground(Color.blue);
        frame.add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String theOrigin = sourceCombo.getSelectedItem().toString();
                String theEnd = destinationCombo.getSelectedItem().toString();

                Vertex source = graph.getNodeByName(theOrigin);
                Vertex destination = graph.getNodeByName(theEnd);
                frame.setBackground(Color.red);
                Dijkstra.findShortestPath(graph, source, destination);
                String path = Dijkstra.getShortestPath(source, destination);
                shortestPathDisplay.setText(path);

                distanceDisplay
                        .setText("Your approximated feasible path is : " + Dijkstra.getTotalDistance(destination));
            }
        });

        // Display
        frame.setSize(400, 500);// 400 width and 500 height
        frame.setLayout(null);// using no layout managers
        frame.setVisible(true);// making the frame visible

    }
}