package com.amanicb.apps.rest.repository;

import com.amanicb.apps.rest.entity.supplier;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class supplierRepo implements JpaRepository<supplier,long> {
    @Override
    public void flush() {
        
    }

    @Override
    public <S extends supplier> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends supplier> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<supplier> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public supplier getOne(long l) {
        return null;
    }

    @Override
    public supplier getById(long l) {
        return null;
    }

    @Override
    public supplier getReferenceById(long l) {
        return null;
    }

    @Override
    public <S extends supplier> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends supplier> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends supplier> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends supplier> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends supplier> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends supplier> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends supplier, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends supplier> S save(S entity) {
        return null;
    }

    @Override
    public <S extends supplier> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<supplier> findById(long l) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(long l) {
        return false;
    }

    @Override
    public List<supplier> findAll() {
        return null;
    }

    @Override
    public List<supplier> findAllById(Iterable<long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(long l) {

    }

    @Override
    public void delete(supplier entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends supplier> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<supplier> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<supplier> findAll(Pageable pageable) {
        return null;
    }
}
