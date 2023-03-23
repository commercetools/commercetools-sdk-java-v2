
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

    public void setMyBusinessUnitStatusOnCreation(final BusinessUnitConfigurationStatus myBusinessUnitStatusOnCreation);

    public static BusinessUnitConfiguration of() {
        return new BusinessUnitConfigurationImpl();
    }

    public static BusinessUnitConfiguration of(final BusinessUnitConfiguration template) {
        BusinessUnitConfigurationImpl instance = new BusinessUnitConfigurationImpl();
        instance.setMyBusinessUnitStatusOnCreation(template.getMyBusinessUnitStatusOnCreation());
        return instance;
    }

    public static BusinessUnitConfigurationBuilder builder() {
        return BusinessUnitConfigurationBuilder.of();
    }

    public static BusinessUnitConfigurationBuilder builder(final BusinessUnitConfiguration template) {
        return BusinessUnitConfigurationBuilder.of(template);
    }

    default <T> T withBusinessUnitConfiguration(Function<BusinessUnitConfiguration, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitConfiguration> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitConfiguration>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitConfiguration>";
            }
        };
    }
}
