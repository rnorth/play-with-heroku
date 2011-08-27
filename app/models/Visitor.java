package models;

import java.util.Date;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Visitor extends Model {

	private Date timeVisited = new Date();
}
