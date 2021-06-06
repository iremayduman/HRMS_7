package kodlama.io.javaCamp6.entities.concretes;





import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name="employer_id",referencedColumnName = "id")
@Table(name="employers")

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAds"})

public class Employer extends User {


	
	@Column(name="company_name")
	private  String companyName;
	
	@Column(name="web_address")
	private String webAddress;
	
	@Column(name="phone_number")
	private String phoneNumber;
	@OneToMany(mappedBy = "employer")
	private List<JobAd> jobAds;
    
    
 
}
