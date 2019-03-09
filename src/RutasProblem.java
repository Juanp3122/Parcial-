import java.util.Arrays;
import java.util.HashMap;



public class RutasProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void rutasAdecuadas(int[]rutaM,int[]rutaT,int tiempoLimite) {
		HashMap<Integer,int[] >Map = new HashMap<Integer,int[]>();
		int res[]= new int[rutaM.length*rutaM.length];
		int[]rutas= new int[2];
		int indice=0;
		for (int i = 0; i < rutaT.length; i++) {
			for (int j = 0; j < rutaT.length; j++) {
				int rutaas[]= {i,j};
				rutas[0]=i;
				rutas[1]=j;
				Map.put((rutaM[i]+rutaT[j])-tiempoLimite,rutaas);
				res[indice]=(rutaM[i]+rutaT[j])-tiempoLimite;
				indice++;
			}
		}
		Arrays.sort(res);
		System.out.println("Mejores combinaciones de asignación ");
		for (int i = 0; i < res.length; i++) {
			
			System.out.println("Ruta de la Mañana: "+Map.get(res[i])[0]+"   "+
			"Ruta de la Tarde: "+Map.get(res[i])[1]);
			
			
		}
	}
	

}
