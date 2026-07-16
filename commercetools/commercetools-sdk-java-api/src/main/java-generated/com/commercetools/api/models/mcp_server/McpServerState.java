
package com.commercetools.api.models.mcp_server;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>State of the MCP Server. A <code>Disabled</code> MCP Server rejects all AI agent tool requests while keeping its configuration editable. Defaults to <code>Enabled</code> when not provided on creation.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface McpServerState extends JsonEnum {

    /**
    <p>The MCP Server is active and accepts AI agent tool requests.</p> */
    McpServerState ENABLED = McpServerStateEnum.ENABLED;
    /**
    <p>The MCP Server rejects all AI agent tool requests while keeping its configuration editable.</p> */
    McpServerState DISABLED = McpServerStateEnum.DISABLED;

    /**
     * possible values of McpServerState
     */
    enum McpServerStateEnum implements McpServerState {
        /**
         * Enabled
         */
        ENABLED("Enabled"),

        /**
         * Disabled
         */
        DISABLED("Disabled");
        private final String jsonName;

        private McpServerStateEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }

        public String toString() {
            return jsonName;
        }
    }

    /**
     * the JSON value
     * @return json value
     */
    @JsonValue
    String getJsonName();

    /**
     * the enum value
     * @return name
     */
    String name();

    /**
     * convert value to string
     * @return string representation
     */
    String toString();

    /**
     * factory method for a enum value of McpServerState
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static McpServerState findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new McpServerState() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }

            public String toString() {
                return value;
            }
        });
    }

    /**
     * method to find enum using the JSON value
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<McpServerState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static McpServerState[] values() {
        return McpServerStateEnum.values();
    }

}
