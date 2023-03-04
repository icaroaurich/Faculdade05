package ifba.elementos.latex;

import ifba.elementos.Corpo;

public class CorpoLATEX extends Corpo {

	@Override
	public String getOutput() {
		return "<p>" + getTexto() + "</p>";
	}

}
