using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}

	protected void OnSumClicked (object sender, EventArgs e)
	{
		int a, b, c;
		a=Convert.ToInt32(num1.Text);
		b=Convert.ToInt32(num1.Text);
		c=a+b
 result.Text=c.ToString();
	}

	protected void OnResetClicked (object sender, EventArgs e)
	{
		num1.Text=num2.Text=result.Text = "";
	}
}
