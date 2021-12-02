package com.OnDemandCarWash.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="Cars")
public class CarManagement {
		@Id
		private int id;
		@Field
		private String brand;
		@Field
		private String type;
		@Field
		private String model;
		@Field 
		private boolean active;
		
		public CarManagement(int id, String brand, String type, String model, boolean active) {
			super();
			this.id = id;
			this.brand = brand;
			this.type = type;
			this.model = model;
			this.active = active;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public boolean isActive() {
			return active;
		}

		public void setStatus(boolean status) {
			active = status;
		}

		@Override
		public String toString() {
			return "CarManagement [id=" + id + ", brand=" + brand + ", type=" + type + ", model=" + model + ", Active="
					+ active + "]";
		}
		
}
