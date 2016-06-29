package com.training;

	public abstract class Media {
		private String title;
		private String type;
		private String rating;
		private double price;
		public Media() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Media(String title, String type, String rating, double price) {
			super();
			this.title = title;
			this.type = type;
			this.rating = rating;
			this.price = price;
		}

		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getRating() {
			return rating;
		}
		public void setRating(String rating) {
			this.rating = rating;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		
		
	}


