package payroll;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class Employee {

		private @Id @GeneratedValue Long id;
		private String name;
		private String role;
		
		
		Employee(String name, String role){
			this.setName(name);
			this.setRole(role);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public void setId(Long id2) {
			this.id = id2;
		}


}
