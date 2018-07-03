package de.itemis.mosig.bnd.prf.test

class GroovyTestClass {

	public static void main(String[] args) {
		java.security.Security.providers.each{p->p.getServices().each{s->println s}}
	}
}
