package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
        // Crea el campo para el nombre con una etiqueta al frente
        // TODO completar
    	txtNombre = new JTextField();
    	JLabel lbNombre = new JLabel("Nombre:");
    	lbNombre.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
    	

        // Crea el selector para la calificación con una etiqueta al frente
        // TODO completar
    	cbbCalificacion = new JComboBox<String>(new String[]{"1", "2", "3", "4", "5"});
    	cbbCalificacion.setSelectedIndex(0);
    	JLabel lbCalificacion = new JLabel("Calificación:");
    	lbCalificacion.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));

        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
        // TODO completar
    	cbbVisitado = new JComboBox<String>(new String[] {"Sí", "No"});
    	cbbVisitado.setSelectedIndex(0);
    	JLabel lbVisitado = new JLabel("Visitado:");
    	lbVisitado.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));

        // Agregar todos los elementos al panel
        // TODO completar
    	setLayout(new GridLayout(3,2));
    	add(lbNombre);
    	add(txtNombre);
    	add(lbCalificacion);
    	add(cbbCalificacion);
    	add(lbVisitado);
    	add(cbbVisitado);
    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
        // TODO completar
    	boolean esVisitado = false;
    	String visitado = (String) cbbVisitado.getSelectedItem();
    	if (visitado.equals("Sí"))
    	{
    		esVisitado = true;
    	}
        return esVisitado;
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
        // TODO completar
        return (String) txtNombre.getText().trim();
    }
}
