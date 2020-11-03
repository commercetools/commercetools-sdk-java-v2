package com.commercetools.importapi.models.importsinks;

import com.commercetools.importapi.models.common.ImportResourceType;
import java.time.ZonedDateTime;
import com.commercetools.importapi.models.importsinks.ImportSinkImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

/**
*  <p>An import sink is the entry point for import resources from other systems.</p>
*  <p>It has an unique key and is specific to an import resource type.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ImportSinkImpl.class)
public interface ImportSink  {

    /**
    *  <p>The unique key of the import sink.</p>
    */
    @NotNull
    @JsonProperty("key")
    public String getKey();
    /**
    *  <p>The type of import resource sent to this import sink.
    *  You can only send one resource type per import sink.</p>
    */
    @NotNull
    @JsonProperty("resourceType")
    public ImportResourceType getResourceType();
    /**
    *  <p>The version of this resource.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    /**
    *  <p>When the import sink was created.</p>
    */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();
    /**
    *  <p>When the import sink was modified.</p>
    */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    public void setKey(final String key);
    
    public void setResourceType(final ImportResourceType resourceType);
    
    public void setVersion(final Long version);
    
    public void setCreatedAt(final ZonedDateTime createdAt);
    
    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public static ImportSinkImpl of(){
        return new ImportSinkImpl();
    }
    

    public static ImportSinkImpl of(final ImportSink template) {
        ImportSinkImpl instance = new ImportSinkImpl();
        instance.setKey(template.getKey());
        instance.setResourceType(template.getResourceType());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        return instance;
    }

    default <T> T withImportSink(Function<ImportSink, T> helper) {
        return helper.apply(this);
    }
}
