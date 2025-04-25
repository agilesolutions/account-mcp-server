package com.agilesolutions.config;

import com.agilesolutions.tools.AccountTools;
import io.modelcontextprotocol.server.McpServerFeatures;
import io.modelcontextprotocol.spec.McpSchema;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class McpConfig {

    @Bean
    public ToolCallbackProvider tools(AccountTools accountTools) {
        return MethodToolCallbackProvider.builder()
                .toolObjects(accountTools)
                .build();
    }

}
