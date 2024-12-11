package com.Inteview.prep.Repository;

import com.Inteview.prep.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository class holds the database related operation and here also @component used to annotate DAO (Data access object) beans.
 * repositories are interfaces that allow data access and manipulation in a consistent and flexible way.
 * There are two types of repositories
 * CRUD Repository : It provides basic operations like, create, read, delete, update for an entity.
 *      syntax : public interface StudentRepository extends CrudRepository<Student, Long> {}
 *      Common methods:
 *          save(S entity) - Save or update an entity.
 *          findById(ID id) - Find an entity by its primary key.
 *          findAll() - Retrieve all entities.
 *          deleteById(ID id) - Delete an entity by its ID.
 *          deleteAll() - Delete all entities.
 * JPA Repository : It extends crud repository and adds jpa specific functionalities.
 *          adds method for batch operations , flushing, and pagination.
 *          Additional Methods:
 *                  saveAndFlush(S entity) - Save and immediately flush changes.
 *                  deleteInBatch(Iterable<T> entities) - Delete multiple entities in a batch.
 *                  findAll(Pageable pageable) - Fetch paginated results.
 *                  findAll(Sort sort) - Fetch sorted results.
 * Pagination and sorting repository : this one also extends crud repository and provides support for pagination and sorting.
 *                  Allows sorting and paginated retrieval of data.
 *                     Syntax : public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {}
 *                          findAll(Pageable pageable) - Retrieve paginated data.
 *                          findAll(Sort sort) - Retrieve sorted data.
 *
 * */
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
