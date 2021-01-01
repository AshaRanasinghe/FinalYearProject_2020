package com.syrusit.syrusapplication.repositary;

import com.syrusit.syrusapplication.entity.SubCategory;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public class SubcategoryRepositoryImpl implements SubcategoryRepository {

    @Override
    public List<SubCategory> findByName(String name) {
        return null;
    }

    @Override
    public List<SubCategory> findAll() {
        return null;
    }

    @Override
    public List<SubCategory> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<SubCategory> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<SubCategory> findAllById(Iterable<String> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(SubCategory subCategory) {

    }

    @Override
    public void deleteAll(Iterable<? extends SubCategory> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends SubCategory> S save(S s) {
        return null;
    }

    @Override
    public <S extends SubCategory> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<SubCategory> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends SubCategory> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<SubCategory> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public SubCategory getOne(String s) {
        return null;
    }

    @Override
    public <S extends SubCategory> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends SubCategory> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends SubCategory> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends SubCategory> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends SubCategory> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends SubCategory> boolean exists(Example<S> example) {
        return false;
    }
}
