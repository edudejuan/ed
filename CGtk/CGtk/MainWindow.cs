using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();
		labelSaludo.Text = "Hola. Pon tu nombre y pulsa Adelante.";
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Console.WriteLine ("OneDeleteEvent");
		Application.Quit ();
		a.RetVal = true;
	}
	protected void OnButtonGoForwardClicked (object sender, EventArgs e)
	{
		labelSaludo.Text = "Hola" + entryNombre.Text;
	}
}


