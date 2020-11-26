package com.features;

import com.features.model.Service;
import com.features.model.Toyota;

public class SealedclassesApplication {

	public static void main(String[] args) {
		final Service svc = new Toyota();
		((Toyota)svc).foo();

		// Using pattern matching ...
		if (svc instanceof Toyota toyota) {
			toyota.foo();
		}
	}

}
