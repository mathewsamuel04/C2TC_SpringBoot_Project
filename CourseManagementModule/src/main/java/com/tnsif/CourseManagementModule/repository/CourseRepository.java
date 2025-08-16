package com.tnsif.CourseManagementModule.repository;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.data.repository.query.Param;

import com.tnsif.CourseManagementModule.entity.Course;
public class CourseRepository implements JpaRepository<Course, Long>{
	//Automated Custom Queries
		//Retrieve a course by its title
		public List<Course> findByTitle(String title) {
			return null;
		}
	    
	    // Retrieve a course by its description
		public List<Course> findByDescription(String description) {
			return null;
		}
	    
	    // Retrieve a course by its start date
		public List<Course> findByStartDate(Date startDate) {
			return null;
		}
	    
	    // Retrieve a course by its end date
		public List<Course> findByEndDate(Date endDate) {
			return null;
		}
		
		// Retrieve courses taught by a specific instructor (case-insensitive)
	    public List<Course> findByInstructorIgnoreCase(String instructor) {
			return null;
		}
	    
	    // Retrieve courses by title containing a keyword
	    public List<Course> findByTitleContaining(String keyword) {
			return null;
		}
	    
	    // Retrieve all courses with pagination
	    public Page<Course> findAll(Pageable pageable) {
			return null;
		}

	    // Custom query to find courses sorted by start date
	    public List<Course> findAllByOrderByStartDateAsc() {
			return null;
		}
	    
	    // Find courses by instructor and title containing a keyword
	    public List<Course> findByInstructorAndTitleContaining(String instructor, String keyword) {
			return null;
		}

	    // Find courses with pagination and sorting by title
	    public Page<Course> findByTitleContaining(String keyword, Pageable pageable) {
			return null;
		}

	    // Count courses by instructor
	    public long countByInstructor(String instructor) {
			return 0;
		}
		
		//Manual Custom Queries
	    
	    // Retrieve courses with an ID less than the provided ID
	    @Query("SELECT c FROM Course c WHERE c.id < :id")
		public
	    List<Course> retrieveByIdLessThan(@Param("id") long id) {
			return null;
		}
	     
	    // Retrieve courses with start date between the provided start and end dates
	    @Query("SELECT c FROM Course c WHERE c.startDate BETWEEN :startDateStartOfDay AND :endDateEndOfDay")
		public
	    List<Course> retrieveByStartDateBetween(
	            @Param("startDateStartOfDay") Date startDateStartOfDay,
	            @Param("endDateEndOfDay") Date endDateEndOfDay) {
			return null;
		}

	    //Retrieve top N courses by end date 
	    @Query("SELECT c FROM Course c ORDER BY c.endDate DESC")
		public
	    List<Course> findTopNByOrderByEndDateDesc(Pageable pageable) {
			return null;
		}

		@Override
		public <S extends Course> List<S> saveAll(Iterable<S> entities) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Course> findAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Course> findAllById(Iterable<Long> ids) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Course> S save(S entity) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Optional<Course> findById(Long id) {
			// TODO Auto-generated method stub
			return Optional.empty();
		}

		@Override
		public boolean existsById(Long id) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public long count() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void deleteById(Long id) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete(Course entity) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAllById(Iterable<? extends Long> ids) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAll(Iterable<? extends Course> entities) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAll() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public List<Course> findAll(Sort sort) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Course> Optional<S> findOne(Example<S> example) {
			// TODO Auto-generated method stub
			return Optional.empty();
		}

		@Override
		public <S extends Course> Page<S> findAll(Example<S> example, Pageable pageable) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Course> long count(Example<S> example) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public <S extends Course> boolean exists(Example<S> example) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public <S extends Course, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void flush() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public <S extends Course> S saveAndFlush(S entity) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Course> List<S> saveAllAndFlush(Iterable<S> entities) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void deleteAllInBatch(Iterable<Course> entities) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAllByIdInBatch(Iterable<Long> ids) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAllInBatch() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Course getOne(Long id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Course getById(Long id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Course getReferenceById(Long id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Course> List<S> findAll(Example<S> example) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Course> List<S> findAll(Example<S> example, Sort sort) {
			// TODO Auto-generated method stub
			return null;
		}
	    
}
