package kodlama.io.javaCamp6.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "job_seekers")
@PrimaryKeyJoinColumn(name = "id")
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class Jobseeker extends User{
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "tc_no")
	private String tcNo;

	@Column(name = "birth_year")
	private int birthYear;

	

	



	
	
	
	
	
}
