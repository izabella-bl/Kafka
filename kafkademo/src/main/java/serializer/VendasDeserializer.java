package serializer;

import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.StringDeserializer;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.Venda;

public class VendasDeserializer implements Deserializer<Venda>{

	@Override
	public Venda deserialize(String topic, byte[] Venda) {
		try {
			return new ObjectMapper().readValue(Venda, Venda.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	

	
}
