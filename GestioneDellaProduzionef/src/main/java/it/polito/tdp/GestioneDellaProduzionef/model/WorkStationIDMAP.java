package it.polito.tdp.GestioneDellaProduzionef.model;

import java.util.HashMap;
import java.util.Map;

public class WorkStationIDMAP {
	
      private Map<String, WorkStation> map;
	
	public WorkStationIDMAP() {
		map = new HashMap<>();
	}
	
	public WorkStation get(String nomeWS) {
		return map.get(nomeWS);
	}
	
	public WorkStation get(WorkStation ws) {
		WorkStation old = map.get(ws.getNome());
		if (old == null) {
			// nella mappa non c'Ë questo corso!
			map.put(ws.getNome(), ws);
			return ws;
		}
		return old;
	}
	
	public void put(String nome, WorkStation ws) {
		map.put(nome, ws);
	}
	

}