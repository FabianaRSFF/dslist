package com.fabianarsff.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Embeddable
public class BelongingPK {
	
	
	@ManyToOne
	@JoinColumn(name = "game_id")
	private Game gane;  
	
	@ManyToOne
	@JoinColumn(name = "list_id")
	private GameList list;
	
	public BelongingPK() {
	}

	public BelongingPK(Game gane, GameList list) {
		this.gane = gane;
		this.list = list;
	}

	public Game getGane() {
		return gane;
	}

	public void setGane(Game gane) {
		this.gane = gane;
	}

	public GameList getList() {
		return list;
	}

	public void setList(GameList list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		return Objects.hash(gane, list);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(gane, other.gane) && Objects.equals(list, other.list);
	}
	
	
}
