class Main {
  public static void main(String args[]) {
		TomadaTresPinos t3 = new TomadaTresPinos();

		Tomada tomadaTarget = new AdaptadorTomada(t3);
		tomadaTarget.ligarNaTomadaDeDoisPinos();
	}
}
