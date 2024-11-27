package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import uniandes.dpoo.swing.interfaz.principal.VentanaPrincipal;

@SuppressWarnings("serial")
public class VentanaAgregarRestaurante extends JFrame
{
    /**
     * El panel donde se editan los detalles del restaurante
     */
    private PanelEditarRestaurante panelDetalles;

    /**
     * El panel con los botones para agregar un restaurante o cerrar la ventana
     */
    private PanelBotonesAgregar panelBotones;

    /**
     * El panel para marcar la ubicación del restaurante
     */
    private PanelMapaAgregar panelMapa;

    /**
     * La ventana principal de la aplicación
     */
    private VentanaPrincipal ventanaPrincipal;

    public VentanaAgregarRestaurante( VentanaPrincipal principal )
    {
        this.ventanaPrincipal = principal;
        setLayout( new BorderLayout( ) );

        // Agrega el panel donde va a estar el mapa
        // TODO completar
        panelMapa = new PanelMapaAgregar();
        panelMapa.setVisible(true);
        add(panelMapa, BorderLayout.CENTER);

        // Agrega en el sur un panel para los detalles del restaurante y para los botones
        // TODO completar
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BorderLayout());
        panelDetalles = new PanelEditarRestaurante();
        panelBotones = new PanelBotonesAgregar(this);
        southPanel.add(panelDetalles, BorderLayout.CENTER);
        southPanel.add(panelBotones, BorderLayout.SOUTH);
        add(southPanel, BorderLayout.SOUTH);

        // Termina de configurar la ventana
        pack( );
        setLocationRelativeTo( null );
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        setResizable( false );
    }

    /**
     * Le pide al panelDetalles los datos del nuevo restaurante y se los envía a la ventana principal para que cree el nuevo restaurante, y luego cierra la ventana.
     */
    public void agregarRestaurante( )
    {
        // TODO completar
    	String nombre = panelDetalles.getNombre();
    	int calificacion = panelDetalles.getCalificacion();
    	boolean visitado = panelDetalles.getVisitado();
    	int[] xy = panelMapa.getCoordenadas();
    	int x = xy[0];
    	int y = xy[1];
    	ventanaPrincipal.agregarRestaurante(nombre, calificacion, x, y, visitado);
    	this.cerrarVentana();
    }
    

    /**
     * Cierra la ventana sin crear un nuevo restaurante
     */
    public void cerrarVentana( )
    {
        dispose( );
    }

}
