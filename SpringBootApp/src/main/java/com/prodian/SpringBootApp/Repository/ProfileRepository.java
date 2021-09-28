package com.prodian.SpringBootApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodian.SpringBootApp.Entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile,Long> {

}
