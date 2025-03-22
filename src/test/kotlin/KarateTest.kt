import com.intuit.karate.junit5.Karate
import com.intuit.karate.junit5.Karate.*

class KarateTest {

    @Karate.Test
    fun testAll(): Karate {
        return run("classpath:features").relativeTo(javaClass)
    }
}