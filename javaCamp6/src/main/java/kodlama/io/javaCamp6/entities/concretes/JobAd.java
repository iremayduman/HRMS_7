package kodlama.io.javaCamp6.entities.concretes;




import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="jobAd")
public class JobAd {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="description")
	private String description;
	
	@Column(name="max_salary")
	private int maxSalary;
	
	@Column(name="min_salary")
	private int minSalary;
	
	@Column(name="open_positions")
	private int openPositions;
	
	@Column(name="is_activated")
	private boolean active;
	
	@Column(name="latest_apply_time")
	private LocalDate latestApplyTime; 
	
	@Column(name="created_time")
	private Date createdTime;
    

    @ManyToOne()
    @JoinColumn(name = "job_title_id")
    private JobTitle jobTitle;
    
    @ManyToOne()
    @JoinColumn(name="city_id")
    private City city;
    
    @ManyToOne()
    @JoinColumn(name="employer_id")
    private Employer employer;
    }

