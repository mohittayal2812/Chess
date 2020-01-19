package Hindi;
public class HybridClass extends Sentence implements Verb {
   
	

	@Override
	public void SubjectMethod() {
		System.out.printf("मैं  is the Subject.\n\n");
	}

	@Override
	public void ObjectMethod() {
		System.out.printf(" चावल  is the Object.\n\n");
	}
	
	protected void SentenceMethod() {
			
		System.out.printf("The sentence is : मैं चावल खा रहा हूँ\n\n");
	}

}
