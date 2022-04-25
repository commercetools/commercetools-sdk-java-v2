
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = HitImpl.class)
public interface Hit {

    /**
    *  <p>Unique ID of the Order.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>Current version of the Order.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
    *  <p>The higher the value is, the more relevant the hit is for the search request.</p>
    */
    @NotNull
    @JsonProperty("relevance")
    public Double getRelevance();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setRelevance(final Double relevance);

    public static Hit of() {
        return new HitImpl();
    }

    public static Hit of(final Hit template) {
        HitImpl instance = new HitImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setRelevance(template.getRelevance());
        return instance;
    }

    public static HitBuilder builder() {
        return HitBuilder.of();
    }

    public static HitBuilder builder(final Hit template) {
        return HitBuilder.of(template);
    }

    default <T> T withHit(Function<Hit, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Hit> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Hit>() {
            @Override
            public String toString() {
                return "TypeReference<Hit>";
            }
        };
    }
}
