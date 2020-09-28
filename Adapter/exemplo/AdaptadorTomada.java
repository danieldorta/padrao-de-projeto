public class AdaptadorTomada implements Tomada {
	private TomadaTresPinos tomadaTresPinos;

	public AdaptadorTomada(TomadaTresPinos tomadaTresPinos) {
		this.tomadaTresPinos = tomadaTresPinos;
	}

	public void ligarNaTomadaDeDoisPinos() {
		tomadaTresPinos.ligarNaTomadaDeTresPinos();
	}
}
