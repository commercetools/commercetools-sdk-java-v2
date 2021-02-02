
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>The request conflicts with the current state of the involved resource(s). Typically, the request attempts to modify a resource
*  that is out of date, i.e. that has been modified by another client since the last time it was retrieved.
*  The client application should resolve the conflict (with or without involving the end-user) before retrying the request</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ConcurrentModificationErrorImpl.class)
public interface ConcurrentModificationError extends ErrorObject {

    String CONCURRENT_MODIFICATION = "ConcurrentModification";

    /**
    *  <p>The version specified in the failed request.</p>
    */

    @JsonProperty("specifiedVersion")
    public Long getSpecifiedVersion();

    /**
    *  <p>The current version of the resource.</p>
    */
    @NotNull
    @JsonProperty("currentVersion")
    public Long getCurrentVersion();

    /**
    *  <p>The conflicted resource.</p>
    */

    @JsonProperty("conflictedResource")
    public Object getConflictedResource();

    public void setSpecifiedVersion(final Long specifiedVersion);

    public void setCurrentVersion(final Long currentVersion);

    public void setConflictedResource(final Object conflictedResource);

    public static ConcurrentModificationError of() {
        return new ConcurrentModificationErrorImpl();
    }

    public static ConcurrentModificationError of(final ConcurrentModificationError template) {
        ConcurrentModificationErrorImpl instance = new ConcurrentModificationErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setSpecifiedVersion(template.getSpecifiedVersion());
        instance.setCurrentVersion(template.getCurrentVersion());
        instance.setConflictedResource(template.getConflictedResource());
        return instance;
    }

    public static ConcurrentModificationErrorBuilder builder() {
        return ConcurrentModificationErrorBuilder.of();
    }

    public static ConcurrentModificationErrorBuilder builder(final ConcurrentModificationError template) {
        return ConcurrentModificationErrorBuilder.of(template);
    }

    default <T> T withConcurrentModificationError(Function<ConcurrentModificationError, T> helper) {
        return helper.apply(this);
    }
}
