package com.github.jrecipes.models;

public class Recipe {

	private int id;
	private String name;
	private String nationality;
	private String region;
	private double difficulty;
	private String price;
	private double average;
	private int prepatationTime;
	private int cookingTime;
	private int nop; // number of people
	private String note;
	private int userId;

	public Recipe() {
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}
	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}
	/**
	 * @return the difficulty
	 */
	public double getDifficulty() {
		return difficulty;
	}
	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @return the average
	 */
	public double getAverage() {
		return average;
	}
	/**
	 * @return the prepatationTime
	 */
	public int getPreparationTime() {
		return prepatationTime;
	}
	/**
	 * @return the cookingTime
	 */
	public int getCookingTime() {
		return cookingTime;
	}
	/**
	 * @return the nop
	 */
	public int getNop() {
		return nop;
	}
	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @param difficulty the difficulty to set
	 */
	public void setDifficulty(double difficulty) {
		this.difficulty = difficulty;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * @param average the average to set
	 */
	public void setAverage(double average) {
		this.average = average;
	}

	/**
	 * @param prepatationTime the prepatationTime to set
	 */
	public void setPrepatationTime(int prepatationTime) {
		this.prepatationTime = prepatationTime;
	}

	/**
	 * @param cookingTime the cookingTime to set
	 */
	public void setCookingTime(int cookingTime) {
		this.cookingTime = cookingTime;
	}

	/**
	 * @param nop the nop to set
	 */
	public void setNop(int nop) {
		this.nop = nop;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	
	/**
	 * This is builder method of the recipe.
	 * @return A recipe builded.
	 */
	public Recipe build() {
		Recipe recipe = new Recipe();
		recipe.id = this.id;
		recipe.name = this.name;
		recipe.nationality = this.nationality;
		recipe.region = this.region;
		recipe.difficulty = this.difficulty;
		recipe.price = this.price;
		recipe.average = this.average;
		recipe.prepatationTime = this.prepatationTime;
		recipe.cookingTime = this.cookingTime;
		recipe.nop = this.nop;
		recipe.note = this.note;
		recipe.userId = this.userId;

		return recipe;
	}

	@Override
	public String toString() {
		return "Recipe [id=" + id + ", name=" + name + ", nationality="
				+ nationality + ", region=" + region + ", difficulty="
				+ difficulty + ", price=" + price + ", average=" + average
				+ ", prepatationTime=" + prepatationTime + ", cookingTime="
				+ cookingTime + ", nop=" + nop + ", note=" + note + ", userId="
				+ userId + "]";
	}

}
