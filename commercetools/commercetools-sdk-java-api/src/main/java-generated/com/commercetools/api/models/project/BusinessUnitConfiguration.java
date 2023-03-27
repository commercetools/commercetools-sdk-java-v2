
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitConfiguration
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitConfiguration businessUnitConfiguration = BusinessUnitConfiguration.builder()
 *             .myBusinessUnitStatusOnCreation(BusinessUnitConfigurationStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitConfigurationImpl.class)
public interface BusinessUnitConfiguration {

    /**
     *  <p>Status of Business Units created using the My Business Unit endpoint.</p>
     * @return myBusinessUnitStatusOnCreation
     */
    @NotNull
    @JsonProperty("myBusinessUnitStatusOnCreation")
    public BusinessUnitConfigurationStatus getMyBusinessUnitStatusOnCreation();

    /**
     *  <p>Status of Business Units created using the My Business Unit endpoint.</p>
     * @param myBusinessUnitStatusOnCreation value to be set
     */

    public void setMyBusinessUnitStatusOnCreation(final BusinessUnitConfigurationStatus myBusinessUnitStatusOnCreation);

    /**
     * factory method
     * @return instance of BusinessUnitConfiguration
     */
    public static BusinessUnitConfiguration of() {
        return new BusinessUnitConfigurationImpl();
    }

    /**
     * factory method to copy an instance of BusinessUnitConfiguration
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitConfiguration of(final BusinessUnitConfiguration template) {
        BusinessUnitConfigurationImpl instance = new BusinessUnitConfigurationImpl();
        instance.setMyBusinessUnitStatusOnCreation(template.getMyBusinessUnitStatusOnCreation());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitConfiguration
     * @return builder
     */
    public static BusinessUnitConfigurationBuilder builder() {
        return BusinessUnitConfigurationBuilder.of();
    }

    /**
     * create builder for BusinessUnitConfiguration instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitConfigurationBuilder builder(final BusinessUnitConfiguration template) {
        return BusinessUnitConfigurationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitConfiguration(Function<BusinessUnitConfiguration, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitConfiguration> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitConfiguration>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitConfiguration>";
            }
        };
    }
}
