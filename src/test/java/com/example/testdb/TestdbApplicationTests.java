package com.example.testdb;

// import com.example.testdb.controller.Messages;
// import com.example.testdb.controller.Repository;
// import com.example.testdb.controller.TestDB;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.MockitoAnnotations;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.http.ResponseEntity;

// import java.util.Arrays;
// import java.util.List;

// import static org.junit.jupiter.api.Assertions.*;
// import static org.mockito.Mockito.*;

@SpringBootTest
class TestdbApplicationTests {

	@Test
	void contextLoads() {
	}

}
	// @Mock
	// private Repository repo;

	// @InjectMocks
	// private TestDB controller;

	// @BeforeEach
	// void setUp() {
	// 	MockitoAnnotations.openMocks(this);
	// }

	// @Test
	// void testGetAll() {
	// 	Messages msg1 = new Messages();
	// 	msg1.setContent("Hello");

	// 	Messages msg2 = new Messages();
	// 	msg2.setContent("World");

	// 	List<Messages> mockList = Arrays.asList(msg1, msg2);

	// 	when(repo.findAll()).thenReturn(mockList);

	// 	ResponseEntity<List<Messages>> response = controller.getAll();

	// 	assertEquals(200, response.getStatusCodeValue());
	// 	assertEquals(2, response.getBody().size());
	// 	verify(repo, times(1)).findAll();
	// }

	// @Test
	// void testSaveMessage() {
	// 	Messages input = new Messages();
	// 	input.setContent("Test content");

	// 	Messages saved = new Messages();
	// 	saved.setContent("Test content");

	// 	when(repo.save(any(Messages.class))).thenReturn(saved);

	// 	ResponseEntity<Messages> response = controller.saveMessage(input);

	// 	assertEquals(200, response.getStatusCodeValue());
	// 	assertEquals("Test content", response.getBody().getContent());
	// 	verify(repo, times(1)).save(any(Messages.class));
	// }

// }
