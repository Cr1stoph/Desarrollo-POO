//importamos la clase JFrame, que representa una ventana
import javax.swing.JFrame;
// importamos la clase JLabel, que miestra texto dentro del Frame
import javax.swing.JLabel;
//importamos JTextField para que el usuario pueda escribir
import javax.swing.JTextField;
//Importamos un combobox
import javax.swing.JComboBox; //Cuadro que apreta y sale lista para abajo
//importamos botones de opcion
import javax.swing.JRadioButton;//Circulos para elegir
//Importamos boton de grupo
import javax.swing.ButtonGroup;


//Vamos a transformar la clase a hija de JFrame
public class VentanaEncuesta extends JFrame{//Para que herede cosas de JFrame
    //Atributos (Componentes gragicos)
    private JLabel lblTitulo;
    private JLabel lblNombre;//Texto escribe "Nombre"
    private JTextField txtNombre;//Recibe el texto en una variable
    //Es para que se puede escribir en un campo
    private JLabel lblCarrera;//Etiqueta para carrera
    private JComboBox<String> cboCarrera;//Combo con opciones de carrera
    private JLabel lblJornada;//Etiqueta para jornada
    private JRadioButton optDiurna;//Opcion Diurna
    private JRadioButton optVespertina;//Opcion Vespertina
    private ButtonGroup grupoJornada;//Boton de grupo seleccion

    //Constructor de la ventana
    public VentanaEncuesta(){//Constructor sin parametros
        initComponents(); //llamamos a metodo que inicia todos los componentes
    }
    //Creamos metodo initComponents que crea, configura y agrega componentes
    //en la ventana de interfaz de usuario
    private void initComponents(){//Metodo privado de la clase Ventana
        //Creamos la etiqueta con texto del titulo
        lblTitulo=new JLabel("Mini Encuesta de Alumnos");
        lblNombre=new JLabel("Nombre: ");//Creamos una etiqueta de texto
        txtNombre=new JTextField();//Creamos un campo de texto para escribir

        //Configuramos el comboBox
        lblCarrera=new JLabel("Carrera: ");//Etiqueta
        cboCarrera=new JComboBox<>(new String []{//Creamos combo lista
            "ingenieria informatica",//Opcion1
            "Analista programador",//Opcion2
            "Ciberseguridad"//Opcion3
        });
        //Configuramos botones de radio para la jornada****
        lblJornada=new JLabel("Jornada: ");
        optDiurna=new JRadioButton("Diurna");
        optVespertina=new JRadioButton("Vespertina");
        //Grupo de botones para que uno esté seleccionado a la vez
        grupoJornada = new ButtonGroup();
        grupoJornada.add(optDiurna);
        grupoJornada.add(optVespertina);

        //Configuramos la Ventana (JFrame)
        setTitle("MiniEncuesta - Ventana Basica");//Texto de la barra
        setSize(400,300);//Tamaño de la ventana
        setLocationRelativeTo(null);//Centra la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cierra la aplicacion
        setLayout(null);//Usamos nulo para posicionar lo componentes con coordenadas
        //Posicionamos los componentes
        lblTitulo.setBounds(50,30,300,30);//Posicion
                                                            // a etiqueta dentro de la ventana
        lblNombre.setBounds(50,70,80,25);//Coordenadas para la etiqueta
        txtNombre.setBounds(130,70,200,25);//Coordenadas para el cuadro de texto

        lblCarrera.setBounds(40,110,80,25);
        cboCarrera.setBounds(130,110,250,25);

        lblJornada.setBounds(40,150,80,25);
        optDiurna.setBounds(130,150,100,25);
        optVespertina.setBounds(240,150,120,25);

        //Agregamos componentes a la ventana
        add(lblTitulo); //Agregamos la etiqueta en la ventana
        add(lblNombre);//Agregamos la etiqueta nombre
        add(txtNombre);//cuadro para agregar escribir
        add(lblCarrera);
        add(cboCarrera);
        add(lblJornada);
        add(optDiurna);
        add(optVespertina);

    }
}
