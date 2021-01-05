package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.ExtensionDestination;
import com.commercetools.api.models.extension.ExtensionAWSLambdaDestinationImpl;

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

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ExtensionAWSLambdaDestinationImpl.class)
public interface ExtensionAWSLambdaDestination extends ExtensionDestination {

    
    @NotNull
    @JsonProperty("arn")
    public String getArn();
    
    @NotNull
    @JsonProperty("accessKey")
    public String getAccessKey();
    
    @NotNull
    @JsonProperty("accessSecret")
    public String getAccessSecret();

    public void setArn(final String arn);
    
    public void setAccessKey(final String accessKey);
    
    public void setAccessSecret(final String accessSecret);

    public static ExtensionAWSLambdaDestination of(){
        return new ExtensionAWSLambdaDestinationImpl();
    }
    

    public static ExtensionAWSLambdaDestination of(final ExtensionAWSLambdaDestination template) {
        ExtensionAWSLambdaDestinationImpl instance = new ExtensionAWSLambdaDestinationImpl();
        instance.setArn(template.getArn());
        instance.setAccessKey(template.getAccessKey());
        instance.setAccessSecret(template.getAccessSecret());
        return instance;
    }

    public static ExtensionAWSLambdaDestinationBuilder builder(){
        return ExtensionAWSLambdaDestinationBuilder.of();
    }
    
    public static ExtensionAWSLambdaDestinationBuilder builder(final ExtensionAWSLambdaDestination template){
        return ExtensionAWSLambdaDestinationBuilder.of(template);
    }
    

    default <T> T withExtensionAWSLambdaDestination(Function<ExtensionAWSLambdaDestination, T> helper) {
        return helper.apply(this);
    }
}
