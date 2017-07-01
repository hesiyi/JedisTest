package redis;
import redis.clients.jedis.Jedis;
//运行redis之前必须要在电脑上安装redis服务（并且已经打开）
public class JedisTest {

	public static void main(String[] args) {
		Jedis jedis = new Jedis("127.0.0.1", 6379);
		jedis.set("hesy", "hesy123");
		System.out.println("Server is running: " + jedis.get("hesy"));
	}
}
