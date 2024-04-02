package br.com.fiap;

public class Cheese {

	private String name;
	private int born;
	private int title;
	private int zone;
	private int section;

	public Cheese() {
	}

	public Cheese(String name, int born, int title, int zone, int section) {
		this.name = name;
		this.born = born;
		this.title = title;
		this.zone = zone;
		this.section = section;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBorn() {
		return born;
	}

	public void setBorn(int born) {
		try {
			if (born <= 1900) {
				this.born = born;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public int getTitle() {
		return title;
	}

	public void setTitle(int title) {
		this.title = title;
	}

	public int getZone() {
		return zone;
	}

	public void setZone(int zone) {
		this.zone = zone;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	public int calculaIdade(int anoAtual) {
		return (anoAtual - born);
	}

}