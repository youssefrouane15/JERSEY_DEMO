package com.luv2kode.jersey.server.config;

import javax.ws.rs.container.DynamicFeature;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.Provider;

import com.luv2kode.jersey.server.Greetings;
import com.luv2kode.jersey.server.filter.ResponseServerFilter;

@Provider
public class HelloDynamicBinding implements DynamicFeature {

    @Override
    public void configure(ResourceInfo resourceInfo, FeatureContext context) {

        if (Greetings.class.equals(resourceInfo.getResourceClass()) && resourceInfo.getResourceMethod()
            .getName()
            .contains("HiGreeting")) {
            context.register(ResponseServerFilter.class);
        }

    }

}
