package mcp.server

import org.springframework.ai.tool.annotation.Tool
import org.springframework.stereotype.Service

@Service
class WeatherService {
    @Tool(description = "Get the current weather information by city name.")
    fun getCurrentWeather(city: String): String {
        // Simulate a weather API call
        return "The current weather in $city is sunny with a temperature of 25°C."
    }
}
